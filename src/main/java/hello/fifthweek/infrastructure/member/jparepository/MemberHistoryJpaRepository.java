package hello.fifthweek.infrastructure.member.jparepository;

import hello.fifthweek.infrastructure.member.entitiy.MemberHistoryInfraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberHistoryJpaRepository extends JpaRepository<MemberHistoryInfraEntity, Long> {
}
