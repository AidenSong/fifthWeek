package hello.fifthweek.interfaces.product.record.request;

import hello.fifthweek.domain.product.record.request.ProductAddHistoryDomainRequest;

import java.time.LocalDateTime;

public record ProductAddHistoryInterfacesRequest(
        long productId,
        long productOptionId,
        int indeAmount,
        int totalQuantity,
        LocalDateTime createdAt
    ) {


    public ProductAddHistoryDomainRequest toDomain() {
        return new ProductAddHistoryDomainRequest(productId, productOptionId, indeAmount, totalQuantity, createdAt);
    }
}
