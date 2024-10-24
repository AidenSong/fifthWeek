package hello.fifthweek.domain.product;


import hello.fifthweek.domain.product.record.response.ProductInfoDomainResponse;
import hello.fifthweek.infrastructure.product.entity.*;
import org.springframework.stereotype.Service;

@Service
public interface ProductRepository {

    boolean productRegist(ProductRegistInfraEntity productRegistInfraEntity);

    boolean productOptionRegist(ProductOptionRegistInfraEntity productOptionRegistInfraEntity);

    ProductInfoDomainResponse productInfo(long productId, long productOptionId);

    boolean productAddHistory(ProductAddHistoryInfraEntity productAddHistoryInfraEntity);

    ProductQuantityInfraEntity productQuantity(long productId, long productOptionId);

    boolean productIndeAmount(ProductIndeAmountInfraEntity productIndeAmountInfraEntity);
}
