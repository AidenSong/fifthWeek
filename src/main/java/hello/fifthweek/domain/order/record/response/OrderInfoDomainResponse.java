package hello.fifthweek.domain.order.record.response;

import hello.fifthweek.interfaces.order.record.response.OrderInfoInterfacesResponse;

public record OrderInfoDomainResponse(
        long orderId,
        long memberId,
        String productList,
        String productOptionIdList,
        String quantityList
    ) {

    public OrderInfoInterfacesResponse toInterfaces() {
        return new OrderInfoInterfacesResponse(orderId, memberId, productList, productOptionIdList, quantityList);
    }
}
