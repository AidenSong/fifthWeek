package hello.fifthweek.domain.member.record.request;

import hello.fifthweek.infrastructure.entitiy.MemberHistoryEntity;

import java.time.LocalDateTime;

public record MemberHistoryDomainRequest(
        long memberId,
        int indeAmount,
        int totalBalance,
        LocalDateTime createdAt
    ) {


    public MemberHistoryEntity toEntity() {
        MemberHistoryEntity entitiy = new MemberHistoryEntity();
        entitiy.setMemberId(memberId);
        entitiy.setIndeAmount(indeAmount);
        entitiy.setTotalBalacne(totalBalance);
        entitiy.setCreatedAt(createdAt);

        return entitiy;
    }
}
