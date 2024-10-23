package hello.fifthweek.interfaces.product.record.request;

import hello.fifthweek.domain.product.record.request.ProductAddHistoryDomainRequest;

import java.time.LocalDateTime;

public record ProductAddHistoryInterfacesRequest(
        long productId,
        int indeAmount,
        int indeQuantity,
        LocalDateTime createdAt
    ) {


    public ProductAddHistoryDomainRequest toDomain() {
        return new ProductAddHistoryDomainRequest(productId, indeAmount, indeQuantity, createdAt);
    }
}
