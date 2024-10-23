package hello.fifthweek.infrastructure.product;


import hello.fifthweek.domain.product.ProductRepository;
import hello.fifthweek.infrastructure.product.entity.ProductRegistEntity;
import hello.fifthweek.infrastructure.product.jparepository.ProductRegistJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ProductRepositoryImpl implements ProductRepository {

    private final ProductRegistJpaRepository productRegistJpaRepository;



    @Override
    public boolean productRegist(ProductRegistEntity productRegistEntity) {
        ProductRegistEntity response = productRegistJpaRepository.save(productRegistEntity);
        if (response == null) {
            return false;
        }
        return true;
    }
}
