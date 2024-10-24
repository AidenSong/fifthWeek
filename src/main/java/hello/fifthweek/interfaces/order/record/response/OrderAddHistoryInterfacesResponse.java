package hello.fifthweek.interfaces.order.record.response;

public record OrderAddHistoryInterfacesResponse(
        long orderId,
        long memberId,
        long productId,
        String productName,
        long productOptionId,
        String productOptionName,
        int quantity
    ) { }
