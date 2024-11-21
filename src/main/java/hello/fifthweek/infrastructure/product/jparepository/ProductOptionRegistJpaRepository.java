package hello.fifthweek.infrastructure.product.jparepository;

import hello.fifthweek.infrastructure.product.entity.ProductOptionRegistInfraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductOptionRegistJpaRepository extends JpaRepository<ProductOptionRegistInfraEntity, Long> {
}
