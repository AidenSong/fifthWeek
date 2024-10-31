package hello.fifthweek.domain.member.record.response;


import hello.fifthweek.interfaces.member.record.response.MemberHistoryInterfacesResponse;

import java.time.LocalDateTime;

public record MemberHistoryDomainResponse(
        long memberId,
        int indeAmount,
        int totalBalance,
        LocalDateTime createdAt
    ) {

    public MemberHistoryInterfacesResponse toInterfaces() {
        return new MemberHistoryInterfacesResponse(memberId, indeAmount, totalBalance, createdAt);
    }
}
