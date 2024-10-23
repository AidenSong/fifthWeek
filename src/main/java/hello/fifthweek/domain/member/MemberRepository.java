package hello.fifthweek.domain.member;

import hello.fifthweek.domain.member.record.response.MemberInfoDomainResponse;
import hello.fifthweek.infrastructure.member.entitiy.MemberHistoryEntity;
import hello.fifthweek.infrastructure.member.entitiy.MemberRegistEntity;

public interface MemberRepository {

    boolean memberRegist(MemberRegistEntity memberRegistEntity);

    MemberInfoDomainResponse memberInfo(long memberId);

    boolean memberHistory(MemberHistoryEntity memberHistoryEntity);
}
