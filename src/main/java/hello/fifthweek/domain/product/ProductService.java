package hello.fifthweek.domain.product;


import hello.fifthweek.domain.product.record.request.*;
import hello.fifthweek.domain.product.record.response.ProductInfoDomainResponse;
import hello.fifthweek.infrastructure.product.entity.ProductQuantityInfraEntity;
import hello.fifthweek.interfaces.product.record.response.ProductInfoInterfacesResponse;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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

    public ProductInfoInterfacesResponse productInfo(long productId) {
        ProductInfoDomainResponse response = productRepository.productInfo(productId);
        return response.toInterfaces();
    }

    public boolean productAddHistory(ProductAddHistoryDomainRequest productAddHistoryDomainRequest) {
        return productRepository.productAddHistory(productAddHistoryDomainRequest.toEntity());
    }

    public int productQuantity(ProductQuantityDomainRequest productQuantityDomainRequest) {
        ProductQuantityInfraEntity response = productRepository.productQuantity(productQuantityDomainRequest.toEntity());
        return response.getProductQuantity();
    }

    public boolean productIndeAmount(ProductIndeAmountDomainRequest productIndeAmountDomainRequest) {
        ProductQuantityInfraEntity quantityResponse = productRepository.productQuantity(new ProductQuantityDomainRequest(productIndeAmountDomainRequest.productId(), productIndeAmountDomainRequest.productOption()).toEntity());
        int quantity = quantityResponse.getProductQuantity();
        int resultQuantity = quantityResponse.getProductQuantity() + quantity;

        ProductIndeAmountDomainRequest request = new ProductIndeAmountDomainRequest(productIndeAmountDomainRequest.productId(), productIndeAmountDomainRequest.productOption(), resultQuantity);
        return productRepository.productIndeAmount(request.toEntity());
    }
}
