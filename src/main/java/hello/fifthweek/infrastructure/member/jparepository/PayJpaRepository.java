package hello.fifthweek.infrastructure.member.jparepository;


import hello.fifthweek.infrastructure.member.entitiy.PayInfraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayJpaRepository extends JpaRepository<PayInfraEntity, Long> {
}
