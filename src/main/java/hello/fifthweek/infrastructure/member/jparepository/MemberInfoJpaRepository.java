package hello.fifthweek.infrastructure.member.jparepository;

import hello.fifthweek.infrastructure.member.entitiy.MemberInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;



public interface MemberInfoJpaRepository extends JpaRepository<MemberInfoEntity, Long> {
}
