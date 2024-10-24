package hello.fifthweek.domain.product;


import hello.fifthweek.domain.product.record.request.*;
import hello.fifthweek.domain.product.record.response.ProductInfoDomainResponse;
import hello.fifthweek.infrastructure.product.entity.ProductQuantityInfraEntity;
import hello.fifthweek.interfaces.product.record.response.ProductInfoInterfacesResponse;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductService {


    private final ProductRepository productRepository;


    public boolean productRegist(ProductRegistDomainRequest productRegistDomainRequest) {
        return productRepository.productRegist(productRegistDomainRequest.toEntity());
    }

    public boolean productOptionRegist(ProductOptionRegistDomainRequest productOptionRegistDomainRequest) {
        return productRepository.productOptionRegist(productOptionRegistDomainRequest.toEntity());
    }

    public ProductInfoInterfacesResponse productInfo(long productId, long productOptionId) {
        ProductInfoDomainResponse response = productRepository.productInfo(productId, productOptionId);
        return response.toInterfaces();
    }

    public boolean productAddHistory(ProductAddHistoryDomainRequest productAddHistoryDomainRequest) {
        return productRepository.productAddHistory(productAddHistoryDomainRequest.toEntity());
    }

    public int productQuantity(long productId, long productOptionId) {
        ProductQuantityInfraEntity response = productRepository.productQuantity(productId, productOptionId);
        return response.getProductQuantity();
    }

    public boolean productIndeAmount(ProductIndeAmountDomainRequest productIndeAmountDomainRequest) {
        ProductQuantityInfraEntity quantityResponse = productRepository.productQuantity(productIndeAmountDomainRequest.productId(), productIndeAmountDomainRequest.productOptionId());
        int quantity = quantityResponse.getProductQuantity();
        int resultQuantity = quantityResponse.getProductQuantity() + quantity;

        ProductIndeAmountDomainRequest request = new ProductIndeAmountDomainRequest(productIndeAmountDomainRequest.productId(), productIndeAmountDomainRequest.productOptionId(), resultQuantity);
        ProductAddHistoryDomainRequest historyRequest = new ProductAddHistoryDomainRequest(productIndeAmountDomainRequest.productId(), productIndeAmountDomainRequest.productOptionId(), quantity, resultQuantity, LocalDateTime.now());

        boolean response = productRepository.productIndeAmount(request.toEntity());
        boolean historyResponse = productRepository.productAddHistory(historyRequest.toEntity());
        return response && historyResponse;
    }
}
