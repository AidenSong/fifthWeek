package hello.fifthweek.interfaces.member;


import hello.fifthweek.domain.member.MemberService;
import hello.fifthweek.domain.order.OrderService;
import hello.fifthweek.domain.order.record.request.OrderInfoDomainRequest;
import hello.fifthweek.domain.product.ProductService;
import hello.fifthweek.interfaces.member.record.request.PayInterfacesRequest;
import hello.fifthweek.interfaces.member.record.response.MemberInfoInterfacesResponse;
import hello.fifthweek.interfaces.order.record.response.OrderInfoInterfacesResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class MemberFacade {


    private final MemberService memberService;
    private final ProductService productService;
    private final OrderService orderService;


    public String pay(PayInterfacesRequest payInterfacesRequest) {
        MemberInfoInterfacesResponse memberInfo = memberService.memberInfo(payInterfacesRequest.memberId());
        OrderInfoInterfacesResponse orderInfo = orderService.orderInfo(new OrderInfoDomainRequest(payInterfacesRequest.orderId(), payInterfacesRequest.memberId()));
        List<String> productList = Arrays.stream(orderInfo.productList().split(",")).toList();
        orderInfo.productOptionIdList();

        return "";
    }


}
