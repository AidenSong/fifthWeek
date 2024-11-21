package hello.fifthweek.domain.member.record.request;

import hello.fifthweek.infrastructure.member.entitiy.MemberHistoryInfraEntity;

import java.time.LocalDateTime;

public record MemberHistoryDomainRequest(
        long memberId,
        int indeAmount,
        int totalBalance,
        LocalDateTime createdAt
    ) {


    public MemberHistoryInfraEntity toEntity() {
        MemberHistoryInfraEntity entitiy = new MemberHistoryInfraEntity();
        entitiy.setMemberId(memberId);
        entitiy.setIndeAmount(indeAmount);
        entitiy.setTotalBalacne(totalBalance);
        entitiy.setCreatedAt(createdAt);

        return entitiy;
    }
}
