package hello.fifthweek.interfaces.order;


import hello.fifthweek.domain.order.OrderService;
import hello.fifthweek.interfaces.order.record.request.OrderAddHistoryInterfacesRequest;
import hello.fifthweek.interfaces.order.record.response.OrderInfoInterfacesResponse;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/orderInfo")
    @Operation(summary = "주문정보 확인")
    public OrderInfoInterfacesResponse orderInfo(long orderId) {
        return orderService.orderInfo(orderId);
    }

    @PostMapping("/orderAddHistory")
    @Operation(summary = "주문기록 추가")
    public boolean orderAddHistory(@RequestBody OrderAddHistoryInterfacesRequest orderAddHistoryInterfacesRequest) {
        return orderService.orderAddHistory(orderAddHistoryInterfacesRequest.toDomain());
    }
}
