package hello.fifthweek.domain.order;


import hello.fifthweek.domain.order.record.request.OrderAddHistoryDomainRequest;
import hello.fifthweek.domain.order.record.request.OrderInfoDomainRequest;
import hello.fifthweek.domain.order.record.response.OrderInfoDomainResponse;
import hello.fifthweek.interfaces.order.record.response.OrderInfoInterfacesResponse;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class OrderService {


    public final OrderRepository orderRepository;



    public OrderInfoInterfacesResponse orderInfo(long orderId) {
        OrderInfoDomainResponse response = orderRepository.orderInfo(orderId);
        return response.toInterfaces();
    }

    public boolean orderAddHistory(OrderAddHistoryDomainRequest orderAddHistoryDomainRequest) {
        return orderRepository.orderAddHistory(orderAddHistoryDomainRequest.toEntity());
    }

}
