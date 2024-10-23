package hello.fifthweek.infrastructure.product;


import hello.fifthweek.domain.product.ProductRepository;
import hello.fifthweek.domain.product.record.response.ProductInfoDomainResponse;
import hello.fifthweek.infrastructure.product.entity.ProductAddHistoryInfraEntity;
import hello.fifthweek.infrastructure.product.entity.ProductInfoInfraEntity;
import hello.fifthweek.infrastructure.product.entity.ProductOptionRegistInfraEntity;
import hello.fifthweek.infrastructure.product.entity.ProductRegistInfraEntity;
import hello.fifthweek.infrastructure.product.jparepository.ProductAddHistoryJpaRepository;
import hello.fifthweek.infrastructure.product.jparepository.ProductInfoJpaRepository;
import hello.fifthweek.infrastructure.product.jparepository.ProductOptionRegistJpaRepository;
import hello.fifthweek.infrastructure.product.jparepository.ProductRegistJpaRepository;
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
    public ProductInfoDomainResponse productInfo(long productId) {
        Optional<ProductInfoInfraEntity> response = productInfoJpaRepository.findById(productId);
        if (response.isEmpty()) {
            return null;
        }
        return response.get().toDomain();
    }

    @Override
    public boolean productAddHistory(ProductAddHistoryInfraEntity productAddHistoryInfraEntity) {
        ProductAddHistoryInfraEntity response = productAddHistoryJpaRepository.save(productAddHistoryInfraEntity);
        if (response == null) {
            return false;
        }
        return true;
    }
}
