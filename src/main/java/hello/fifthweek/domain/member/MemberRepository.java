package hello.fifthweek.domain.member;

import hello.fifthweek.domain.member.record.response.MemberHistoryDomainResponse;
import hello.fifthweek.domain.member.record.response.MemberInfoDomainResponse;
import hello.fifthweek.infrastructure.member.entitiy.MemberHistoryInfraEntity;
import hello.fifthweek.infrastructure.member.entitiy.MemberRegistInfraEntity;
import hello.fifthweek.infrastructure.member.entitiy.UpdateMemberBalanceInfraEntity;

import java.util.List;

public interface MemberRepository {

    boolean memberRegist(MemberRegistInfraEntity memberRegistInfraEntity);

    MemberInfoDomainResponse memberInfo(long memberId);

    boolean memberAddHistory(MemberHistoryInfraEntity memberHistoryInfraEntity);

    boolean updateMemberBalance(UpdateMemberBalanceInfraEntity updateMemberBalanceInfraEntity);

    List<MemberHistoryDomainResponse> memberHistory(long memberId);
}
