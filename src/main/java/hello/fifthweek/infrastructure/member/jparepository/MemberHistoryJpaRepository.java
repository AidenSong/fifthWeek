package hello.fifthweek.infrastructure.member.jparepository;

import hello.fifthweek.infrastructure.member.entitiy.MemberHistoryInfraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MemberHistoryJpaRepository extends JpaRepository<MemberHistoryInfraEntity, Long> {

    List<MemberHistoryInfraEntity> findAllByMemberId(Long memberId);
}
