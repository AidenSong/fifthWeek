package hello.fifthweek.interfaces.order.record.request;


import hello.fifthweek.domain.order.record.request.OrderAddHistoryDomainRequest;

public record OrderAddHistoryInterfacesRequest(
        long orderId,
        long memberId,
        long productId,
        long productOptionId
    ) {

    public OrderAddHistoryDomainRequest toDomain() {
        return new OrderAddHistoryDomainRequest(orderId, memberId, productId, productOptionId);
    }
}
