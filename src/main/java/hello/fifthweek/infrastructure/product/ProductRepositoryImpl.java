package hello.fifthweek.infrastructure.product;


import hello.fifthweek.domain.product.ProductRepository;
import hello.fifthweek.infrastructure.product.entity.ProductOptionRegistInfraEntity;
import hello.fifthweek.infrastructure.product.entity.ProductRegistInfraEntity;
import hello.fifthweek.infrastructure.product.jparepository.ProductOptionRegistJpaRepository;
import hello.fifthweek.infrastructure.product.jparepository.ProductRegistJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ProductRepositoryImpl implements ProductRepository {

    private final ProductRegistJpaRepository productRegistJpaRepository;
    private final ProductOptionRegistJpaRepository productOptionRegistJpaRepository;



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
}
