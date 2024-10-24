package hello.fifthweek.domain.order.record.response;

import hello.fifthweek.interfaces.order.record.response.OrderAddHistoryInterfacesResponse;

public record OrderAddHistoryDomainResponse(
        long orderId,
        long memberId,
        long productId,
        String productName,
        long productOptionId,
        String productOptionName,
        int quantity
    ) {


    public OrderAddHistoryInterfacesResponse toInterfaces() {
        return new OrderAddHistoryInterfacesResponse(orderId, memberId, productId, productName, productOptionId, productOptionName, quantity);
    }

}
