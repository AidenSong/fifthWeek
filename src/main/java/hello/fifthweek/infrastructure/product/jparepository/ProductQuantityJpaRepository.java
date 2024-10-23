package hello.fifthweek.infrastructure.product.jparepository;

import hello.fifthweek.infrastructure.product.entity.ProductQuantityInfraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductQuantityJpaRepository extends JpaRepository<ProductQuantityInfraEntity, Long> {

    ProductQuantityInfraEntity findByProductIdAndProductOption(long productId, String productOption);
}
