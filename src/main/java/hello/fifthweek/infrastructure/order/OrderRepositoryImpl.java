package hello.fifthweek.infrastructure.order;


import hello.fifthweek.domain.order.OrderRepository;
import hello.fifthweek.domain.order.record.response.OrderInfoDomainResponse;
import hello.fifthweek.infrastructure.order.entity.OrderInfoInfraEntity;
import hello.fifthweek.infrastructure.order.jparepository.OrderInfoJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class OrderRepositoryImpl implements OrderRepository {


    private final OrderInfoJpaRepository orderInfoJpaRepository;


    @Override
    public OrderInfoDomainResponse orderinfo(OrderInfoInfraEntity orderInfoInfraEntity) {
        OrderInfoInfraEntity response = orderInfoJpaRepository.findByOrderIdAndMemberId(orderInfoInfraEntity.getOrderId(), orderInfoInfraEntity.getMemberId());
        if (response == null) {
            return null;
        }
        return response.toDomain();
    }
}
