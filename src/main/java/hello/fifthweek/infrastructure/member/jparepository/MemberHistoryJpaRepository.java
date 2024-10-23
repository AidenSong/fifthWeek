package hello.fifthweek.infrastructure.member.jparepository;

import hello.fifthweek.infrastructure.member.entitiy.MemberHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberHistoryJpaRepository extends JpaRepository<MemberHistoryEntity, Long> {
}
