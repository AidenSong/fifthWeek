package hello.fifthweek.interfaces.payment.record.request;

import hello.fifthweek.domain.payment.record.request.PaymentAddHistoryDomainRequest;

public record PaymentAddHistoryInterfacesRequest(
        long memberId,
        long orderId,
        int paymentAmount
    ) {

    public PaymentAddHistoryDomainRequest toDomain() {
        return new PaymentAddHistoryDomainRequest(memberId, orderId, paymentAmount);
    }
}
