package hello.fifthweek.domain.member;

import hello.fifthweek.domain.member.record.response.MemberInfoDomainResponse;
import hello.fifthweek.infrastructure.member.entitiy.MemberHistoryInfraEntity;
import hello.fifthweek.infrastructure.member.entitiy.MemberRegistInfraEntity;

public interface MemberRepository {

    boolean memberRegist(MemberRegistInfraEntity memberRegistInfraEntity);

    MemberInfoDomainResponse memberInfo(long memberId);

    boolean memberHistory(MemberHistoryInfraEntity memberHistoryInfraEntity);
}
