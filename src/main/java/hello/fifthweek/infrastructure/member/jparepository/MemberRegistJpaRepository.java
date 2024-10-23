package hello.fifthweek.infrastructure.member.jparepository;

import hello.fifthweek.infrastructure.member.entitiy.MemberRegistEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRegistJpaRepository extends JpaRepository<MemberRegistEntity, Long> {
}
