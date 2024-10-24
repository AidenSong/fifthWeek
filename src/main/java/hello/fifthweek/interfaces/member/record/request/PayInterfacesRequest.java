package hello.fifthweek.interfaces.member.record.request;

import hello.fifthweek.domain.member.record.request.PayDomainRequest;

public record PayInterfacesRequest(
        long memberId,
        long orderId
    ) {

    public PayDomainRequest toDomain() {
        return new PayDomainRequest(memberId, orderId);
    }
}
