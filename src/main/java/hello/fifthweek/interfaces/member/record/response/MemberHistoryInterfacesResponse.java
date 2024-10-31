package hello.fifthweek.interfaces.member.record.response;

import java.time.LocalDateTime;

public record MemberHistoryInterfacesResponse(
        long memberId,
        int indeAmount,
        int totalBalance,
        LocalDateTime createdAt
    ) {
}
