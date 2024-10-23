package hello.fifthweek.infrastructure.product.jparepository;

import hello.fifthweek.infrastructure.product.entity.ProductRegistInfraEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface
ProductRegistJpaRepository extends JpaRepository<ProductRegistInfraEntity, Long> {
}
