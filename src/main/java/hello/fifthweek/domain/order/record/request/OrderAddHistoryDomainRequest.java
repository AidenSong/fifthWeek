package hello.fifthweek.domain.order.record.request;


import hello.fifthweek.infrastructure.order.entity.OrderAddHistoryInfraEntity;

public record OrderAddHistoryDomainRequest(
        long orderId,
        long memberId,
        long productId,
        long productOptionId
    ) {

    public OrderAddHistoryInfraEntity toEntity() {
        OrderAddHistoryInfraEntity entity = new OrderAddHistoryInfraEntity();
        entity.setOrderId(orderId);
        entity.setMemberId(memberId);
        entity.setProductId(productId);
        entity.setProductOptionId(productOptionId);

        return entity;
    }
}
