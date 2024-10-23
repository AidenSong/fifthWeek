package hello.fifthweek.infrastructure.member.jparepository;

import hello.fifthweek.infrastructure.member.entitiy.MemberRegistInfraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRegistJpaRepository extends JpaRepository<MemberRegistInfraEntity, Long> {
}
