package hello.fifthweek.domain.member.record.request;


import hello.fifthweek.infrastructure.member.entitiy.PayInfraEntity;

public record PayDomainRequest(
        long memberId,
        long orderId
    ) {

    public PayInfraEntity toEntity() {
        PayInfraEntity entity = new PayInfraEntity();
        entity.setMemberId(memberId);
        entity.setOrderId(orderId);

        return entity;
    }
}
