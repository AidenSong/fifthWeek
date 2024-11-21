package hello.fifthweek.interfaces.order.record.response;

public record OrderInfoInterfacesResponse(
        long orderId,
        long memberId,
        String productIdList,
        String productOptionIdList,
        String quantityList
    ) { }
