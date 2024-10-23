package hello.fifthweek.infrastructure.order;


import hello.fifthweek.domain.order.OrderRepository;
import hello.fifthweek.domain.order.record.response.OrderInfoDomainResponse;
import hello.fifthweek.infrastructure.order.entity.OrderAddHistoryInfraEntity;
import hello.fifthweek.infrastructure.order.entity.OrderInfoInfraEntity;
import hello.fifthweek.infrastructure.order.jparepository.OrderAddHistoryJpaRepository;
import hello.fifthweek.infrastructure.order.jparepository.OrderInfoJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class OrderRepositoryImpl implements OrderRepository {


    private final OrderInfoJpaRepository orderInfoJpaRepository;
    private final OrderAddHistoryJpaRepository orderAddHistoryJpaRepository;


    @Override
    public OrderInfoDomainResponse orderInfo(OrderInfoInfraEntity orderInfoInfraEntity) {
        OrderInfoInfraEntity response = orderInfoJpaRepository.findByOrderIdAndMemberId(orderInfoInfraEntity.getOrderId(), orderInfoInfraEntity.getMemberId());
        if (response == null) {
            return null;
        }
        return response.toDomain();
    }

    @Override
    public boolean orderAddHistory(OrderAddHistoryInfraEntity orderAddHistoryInfraEntity) {
        OrderAddHistoryInfraEntity response = orderAddHistoryJpaRepository.findByOrderIdAndMemberIdAndProductIdAndProductOptionId(
            orderAddHistoryInfraEntity.getOrderId(),
            orderAddHistoryInfraEntity.getMemberId(),
            orderAddHistoryInfraEntity.getProductId(),
            orderAddHistoryInfraEntity.getProductOptionId()
        );
        if (response == null) {
            return false;
        }
        return true;
    }


}
