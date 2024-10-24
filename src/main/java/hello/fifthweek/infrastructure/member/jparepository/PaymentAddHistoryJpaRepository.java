package hello.fifthweek.infrastructure.member.jparepository;

import hello.fifthweek.infrastructure.member.entitiy.PaymentAddHistoryInfraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentAddHistoryJpaRepository extends JpaRepository<PaymentAddHistoryInfraEntity, Long> {
}
