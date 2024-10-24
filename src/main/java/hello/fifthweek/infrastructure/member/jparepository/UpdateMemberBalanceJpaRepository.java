package hello.fifthweek.infrastructure.member.jparepository;


import hello.fifthweek.infrastructure.member.entitiy.UpdateMemberBalanceInfraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UpdateMemberBalanceJpaRepository extends JpaRepository<UpdateMemberBalanceInfraEntity, Long> {

    @Modifying
    @Query(value = "UPDATE MEMBER_INFO SET MEMBER_BALANCE = :memberBalance WHERE MEMBER_ID = :memberId", nativeQuery = true)
    UpdateMemberBalanceInfraEntity updateMemberBalance(@Param("memberId") Long memberId, @Param("memberBalance") long memberBalance);
}
