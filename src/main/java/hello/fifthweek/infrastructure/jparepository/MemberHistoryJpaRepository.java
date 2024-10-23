package hello.fifthweek.infrastructure.jparepository;

import hello.fifthweek.infrastructure.entitiy.MemberHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberHistoryJpaRepository extends JpaRepository<MemberHistoryEntity, Long> {
}
