package hello.fifthweek.interfaces.order.record.response;

public record OrderInfoInterfacesResponse(
        long productId,
        long memberId,
        String productList,
        String productOptionList,
        String quantityList
    ) { }
