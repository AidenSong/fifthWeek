package hello.fifthweek.domain.member;

import hello.fifthweek.domain.member.record.response.MemberInfoDomainResponse;
import hello.fifthweek.infrastructure.entitiy.MemberHistoryEntity;
import hello.fifthweek.infrastructure.entitiy.MemberRegistEntity;

public interface MemberRepository {

    boolean memberRegist(MemberRegistEntity memberRegistEntity);

    MemberInfoDomainResponse memberInfo(long memberId);

    boolean memberHistory(MemberHistoryEntity memberHistoryEntity);
}
