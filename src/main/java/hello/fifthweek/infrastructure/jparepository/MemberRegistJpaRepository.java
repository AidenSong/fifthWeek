package hello.fifthweek.infrastructure.jparepository;

import hello.fifthweek.infrastructure.entitiy.MemberRegistEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRegistJpaRepository extends JpaRepository<MemberRegistEntity, Long> {
}
