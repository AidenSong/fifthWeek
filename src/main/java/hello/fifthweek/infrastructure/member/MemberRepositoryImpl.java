package hello.fifthweek.infrastructure.member;


import hello.fifthweek.domain.member.MemberRepository;
import hello.fifthweek.domain.member.record.response.MemberHistoryDomainResponse;
import hello.fifthweek.domain.member.record.response.MemberInfoDomainResponse;
import hello.fifthweek.infrastructure.member.entitiy.*;
import hello.fifthweek.infrastructure.member.jparepository.*;
import hello.fifthweek.infrastructure.payment.entity.PayInfraEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Repository
@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberRepository {



    private final MemberInfoJpaRepository memberInfoJpaRepository;
    private final MemberHistoryJpaRepository memberHistoryJpaRepository;
    private final MemberRegistJpaRepository memberRegistJpaRepository;
    private final UpdateMemberBalanceJpaRepository updateMemberBalanceJpaRepository;



    @Override
    public boolean memberRegist(MemberRegistInfraEntity memberRegistInfraEntity) {

        MemberRegistInfraEntity response = memberRegistJpaRepository.save(memberRegistInfraEntity);
        if (response == null) {
            return false;
        }
        return true;
    }

    @Override
    public MemberInfoDomainResponse memberInfo(long memberId) {

        Optional<MemberInfoInfraEntity> response = memberInfoJpaRepository.findById(memberId);
        if (response == null) {
            return null;
        }
        return response.get().toDomain();
    }

    public boolean memberAddHistory(MemberHistoryInfraEntity memberHistoryInfraEntity) {

        MemberHistoryInfraEntity response = memberHistoryJpaRepository.save(memberHistoryInfraEntity);
        if (response == null) {
            return false;
        }
        return true;
    }


    @Override
    public boolean updateMemberBalance(UpdateMemberBalanceInfraEntity updateMemberBalanceInfraEntity) {

        int response = updateMemberBalanceJpaRepository.updateMemberBalance(updateMemberBalanceInfraEntity.getMemberId(), updateMemberBalanceInfraEntity.getMemberBalance());
        if (response <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public List<MemberHistoryDomainResponse> memberHistory(long memberId) {
        List<MemberHistoryInfraEntity> response = memberHistoryJpaRepository.findAllByMemberId(memberId);
        return response.stream().map(MemberHistoryInfraEntity::toDomain).collect(Collectors.toList());
    }
}
