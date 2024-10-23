package hello.fifthweek.infrastructure.product.jparepository;

import hello.fifthweek.infrastructure.product.entity.ProductAddHistoryInfraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductAddHistoryJpaRepository extends JpaRepository<ProductAddHistoryInfraEntity, Long> {
}
