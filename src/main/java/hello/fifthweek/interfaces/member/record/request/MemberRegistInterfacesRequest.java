package hello.fifthweek.interfaces.member.record.request;

import hello.fifthweek.domain.member.record.request.MemberRegistDomainRequest;
import hello.fifthweek.domain.member.record.request.PaymentAddHistoryDomainRequest;

import static hello.fifthweek.domain.member.record.request.MemberRegistDomainRequest.*;

public record MemberRegistInterfacesRequest(long memberId, int memberBalance) {


    public MemberRegistDomainRequest toDomain() {
        return new MemberRegistDomainRequest(memberId, memberBalance);
    }

    public static record PaymentAddHistoryInterfacesRequest(
            long memberId,
            long orderId,
            int paymentAmount
        ) {

        public PaymentAddHistoryDomainRequest toDomain() {
            return new PaymentAddHistoryDomainRequest(memberId, orderId, paymentAmount);
        }
    }
}
