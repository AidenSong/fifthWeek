package hello.fifthweek.interfaces.payment.record.request;


import hello.fifthweek.domain.payment.record.request.PayDomainRequest;

public record PayInterfacesRequest(long orderId, long memberId) {


    public PayDomainRequest toDomain() {
        return new PayDomainRequest(orderId, memberId);
    }
}
