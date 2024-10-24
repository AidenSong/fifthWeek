package hello.fifthweek.infrastructure.product;


import hello.fifthweek.domain.product.ProductRepository;
import hello.fifthweek.domain.product.record.response.ProductInfoDomainResponse;
import hello.fifthweek.infrastructure.product.entity.*;
import hello.fifthweek.infrastructure.product.jparepository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class ProductRepositoryImpl implements ProductRepository {

    private final ProductRegistJpaRepository productRegistJpaRepository;
    private final ProductOptionRegistJpaRepository productOptionRegistJpaRepository;
    private final ProductInfoJpaRepository productInfoJpaRepository;
    private final ProductAddHistoryJpaRepository productAddHistoryJpaRepository;
    private final ProductIndeAmountJpaRepository productIndeAmountJpaRepository;
    private final ProductQuantityJpaRepository productQuantityJpaRepository;



    @Override
    public boolean productRegist(ProductRegistInfraEntity productRegistInfraEntity) {
        ProductRegistInfraEntity response = productRegistJpaRepository.save(productRegistInfraEntity);
        if (response == null) {
            return false;
        }
        return true;
    }

    @Override
    public boolean productOptionRegist(ProductOptionRegistInfraEntity productOptionRegistInfraEntity) {
        ProductOptionRegistInfraEntity response = productOptionRegistJpaRepository.save(productOptionRegistInfraEntity);
        if (response == null) {
            return false;
        }
        return true;
    }

    @Override
    public ProductInfoDomainResponse productInfo(ProductInfoInfraEntity productInfoInfraEntity) {
        ProductInfoInfraEntity response = productInfoJpaRepository.findByProductId(productInfoInfraEntity.getProductId(), productInfoInfraEntity.getProductOptionId());
        if (response == null) {
            return null;
        }
        return response.toDomain();
    }

    @Override
    public boolean productAddHistory(ProductAddHistoryInfraEntity productAddHistoryInfraEntity) {
        ProductAddHistoryInfraEntity response = productAddHistoryJpaRepository.save(productAddHistoryInfraEntity);
        if (response == null) {
            return false;
        }
        return true;
    }

    @Override
    public ProductQuantityInfraEntity productQuantity(ProductQuantityInfraEntity productQuantityInfraEntity) {
        return productQuantityJpaRepository.findByProductIdAndProductOptionId(productQuantityInfraEntity.getProductId(), productQuantityInfraEntity.getProductOptionId());
    }

    public boolean productIndeAmount(ProductIndeAmountInfraEntity productIndeAmountInfraEntity) {
        ProductQuantityInfraEntity response = productIndeAmountJpaRepository.updateByProductId(productIndeAmountInfraEntity.getProductId(), productIndeAmountInfraEntity.getProductOptionId(), productIndeAmountInfraEntity.getProductQuantity());
        if (response == null) {
            return false;
        }
        return true;
    }
}
