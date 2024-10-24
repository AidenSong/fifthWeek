package hello.fifthweek.domain.member;

import hello.fifthweek.domain.member.record.response.MemberInfoDomainResponse;
import hello.fifthweek.infrastructure.member.entitiy.MemberHistoryInfraEntity;
import hello.fifthweek.infrastructure.member.entitiy.MemberRegistInfraEntity;
import hello.fifthweek.infrastructure.member.entitiy.PaymentAddHistoryInfraEntity;

public interface MemberRepository {

    boolean memberRegist(MemberRegistInfraEntity memberRegistInfraEntity);

    MemberInfoDomainResponse memberInfo(long memberId);

    boolean memberAddHistory(MemberHistoryInfraEntity memberHistoryInfraEntity);

    boolean paymentAddHistory(PaymentAddHistoryInfraEntity paymentAddHistoryInfraEntity);
}
