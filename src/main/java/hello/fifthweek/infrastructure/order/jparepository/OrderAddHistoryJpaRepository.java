package hello.fifthweek.infrastructure.order.jparepository;

import hello.fifthweek.infrastructure.order.entity.OrderAddHistoryInfraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderAddHistoryJpaRepository extends JpaRepository<OrderAddHistoryInfraEntity, Long> {

    OrderAddHistoryInfraEntity findByOrderIdAndMemberIdAndProductIdAndProductOptionId(Long orderId, Long memberId, Long productId, Long productOptionId);
}
