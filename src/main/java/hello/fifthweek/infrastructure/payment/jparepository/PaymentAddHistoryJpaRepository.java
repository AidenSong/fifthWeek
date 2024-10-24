package hello.fifthweek.infrastructure.payment.jparepository;


import hello.fifthweek.infrastructure.payment.entity.PaymentAddHistoryInfraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentAddHistoryJpaRepository extends JpaRepository<PaymentAddHistoryInfraEntity, Long> {
}
