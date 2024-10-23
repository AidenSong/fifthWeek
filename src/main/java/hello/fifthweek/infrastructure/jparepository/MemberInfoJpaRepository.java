package hello.fifthweek.infrastructure.jparepository;

import hello.fifthweek.infrastructure.entitiy.MemberInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;



public interface MemberInfoJpaRepository extends JpaRepository<MemberInfoEntity, Long> {
}
