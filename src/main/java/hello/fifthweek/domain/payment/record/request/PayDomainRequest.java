package hello.fifthweek.domain.payment.record.request;


import hello.fifthweek.infrastructure.payment.entity.PayInfraEntity;

public record PayDomainRequest(long orderId, long memberId) {


    public PayInfraEntity toEntity() {
        PayInfraEntity entity = new PayInfraEntity();
        entity.setOrderId(orderId);
        entity.setMemberId(memberId);

        return entity;
    }
}
