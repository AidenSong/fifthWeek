package hello.fifthweek.interfaces.payment;

import hello.fifthweek.domain.member.MemberService;
import hello.fifthweek.domain.member.record.request.MemberHistoryDomainRequest;
import hello.fifthweek.domain.member.record.request.UpdateMemberBalanceDomainRequest;
import hello.fifthweek.domain.order.OrderService;
import hello.fifthweek.domain.payment.PaymentService;
import hello.fifthweek.domain.product.ProductService;
import hello.fifthweek.domain.product.record.request.ProductIndeAmountDomainRequest;
import hello.fifthweek.interfaces.member.record.response.MemberInfoInterfacesResponse;
import hello.fifthweek.interfaces.order.record.response.OrderInfoInterfacesResponse;
import hello.fifthweek.interfaces.payment.record.request.PayInterfacesRequest;
import hello.fifthweek.interfaces.payment.record.request.PaymentAddHistoryInterfacesRequest;
import hello.fifthweek.interfaces.product.record.response.ProductInfoInterfacesResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class PaymentFacade {




    private final OrderService orderService;
    private final ProductService productService;
    private final MemberService memberService;
    private final PaymentService paymentService;


    public boolean paymentAddHistory(long memberId, long orderId, int paymentAmount) {
        return paymentService.paymentAddHistory(memberId, orderId, paymentAmount);
    }


    public boolean pay(PayInterfacesRequest payInterfacesRequest) throws Exception {
        int sumPrice = 0;
        List<Integer> productQuantityList = new ArrayList<>();

        MemberInfoInterfacesResponse memberInfo = memberService.memberInfo(payInterfacesRequest.memberId());
        OrderInfoInterfacesResponse orderInfo = orderService.orderInfo(payInterfacesRequest.orderId());
        List<String> productIdList = Arrays.stream(orderInfo.productIdList().split(",")).toList();
        List<String> productOptionIdList = Arrays.stream(orderInfo.productOptionIdList().split(",")).toList();
        List<String> quantityList = Arrays.stream(orderInfo.quantityList().split(",")).toList();


        // 상품 정보
        for (int i = 0; i < productIdList.size(); i++) {
            ProductInfoInterfacesResponse product = productService.productInfo(Long.parseLong(productIdList.get(i)), Long.parseLong(productOptionIdList.get(i)));
            productQuantityList.add(product.productQuantity());
            sumPrice += product.productPrice() * Integer.parseInt(quantityList.get(i));
        }

        // 상품의 재고 확인
        for (int i = 0; i < productIdList.size(); i++) {
            if (productQuantityList.get(i) < Integer.parseInt(quantityList.get(i))) {
                throw new Exception("상품의 재고가 부족합니다." + " productId: " + productIdList.get(i) + " productOptionId: " + productOptionIdList.get(i));
            }
        }

        // sum = 충전금액 - 재품 가격 합계
        int sum = memberInfo.memberBalance() - sumPrice;
        if (sum < 0) {
            throw new Exception("잔액이 부족합니다");
        }

        // 결제
        boolean memberResponse = memberService.updateMemberBalance(new UpdateMemberBalanceDomainRequest(memberInfo.memberId(), sum));
        if (!memberResponse) {
            throw new Exception("잔액 갱신에 실패하였습니다.");
        }

        // 회원기록 추가
        boolean memberHistory = memberService.memberAddHistory(new MemberHistoryDomainRequest(memberInfo.memberId(), sumPrice, sum, LocalDateTime.now()));
        if (!memberHistory) {
            throw new Exception("회원기록 추가에 실패하였습니다.");
        }

        // 제품 재고 감소
        for (int i = 0; i < productIdList.size(); i++) {
            boolean indeResult = productService.productIndeAmount(
                new ProductIndeAmountDomainRequest(
                    Long.parseLong(productIdList.get(i)),
                    Long.parseLong(productOptionIdList.get(i)),
                    Integer.parseInt(quantityList.get(i))
                )
            );
            if (!indeResult) {
                throw new Exception("제품 재고 감소에 실패하였습니다.");
            }
        }

        // 결제 기록 추가
        paymentAddHistory(memberInfo.memberId(), orderInfo.orderId(), sumPrice);
        return true;
    }
}
