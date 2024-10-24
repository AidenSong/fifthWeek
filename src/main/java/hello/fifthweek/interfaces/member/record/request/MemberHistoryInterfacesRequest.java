package hello.fifthweek.interfaces.member.record.request;


import hello.fifthweek.domain.member.record.request.MemberHistoryDomainRequest;

import java.time.LocalDateTime;

public record MemberHistoryInterfacesRequest(
        long memberId,
        int indeAmount,
        int totalBalance,
        LocalDateTime createdAt
    ) {

    public MemberHistoryDomainRequest toDomain() {
        return new MemberHistoryDomainRequest(memberId, indeAmount, totalBalance, createdAt);
    }
}
