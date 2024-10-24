package hello.fifthweek.infrastructure.order.jparepository;

import hello.fifthweek.infrastructure.order.entity.OrderInfoInfraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderInfoJpaRepository extends JpaRepository<OrderInfoInfraEntity, Long> {


//    OrderInfoInfraEntity findByOrderIdAndMemberId(long orderId, long memberId);
}
