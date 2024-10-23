package hello.fifthweek.domain.order;


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



    public OrderInfoInterfacesResponse orderInfo(OrderInfoDomainRequest orderInfoDomainRequest) {
        OrderInfoDomainResponse response = orderRepository.orderinfo(orderInfoDomainRequest.toEntity());
        return response.toInterfaces();
    }



}
