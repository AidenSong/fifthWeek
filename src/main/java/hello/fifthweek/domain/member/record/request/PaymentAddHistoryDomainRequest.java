package hello.fifthweek.domain.member.record.request;

import hello.fifthweek.infrastructure.member.entitiy.PaymentAddHistoryInfraEntity;

public record PaymentAddHistoryDomainRequest(
        long memberId,
        long orderId,
        int paymentAmount
    ) {

    public PaymentAddHistoryInfraEntity toEntity() {
        PaymentAddHistoryInfraEntity entity = new PaymentAddHistoryInfraEntity();
        entity.setMemberId(memberId);
        entity.setOrderId(orderId);
        entity.setPaymentAmount(paymentAmount);

        return entity;
    }
}
