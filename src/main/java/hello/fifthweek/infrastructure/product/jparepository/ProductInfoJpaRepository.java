package hello.fifthweek.infrastructure.product.jparepository;

import hello.fifthweek.infrastructure.product.entity.ProductInfoInfraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInfoJpaRepository extends JpaRepository<ProductInfoInfraEntity, Long> {
}
