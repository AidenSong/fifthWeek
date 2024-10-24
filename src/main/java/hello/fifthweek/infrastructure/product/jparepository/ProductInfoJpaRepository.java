package hello.fifthweek.infrastructure.product.jparepository;

import hello.fifthweek.infrastructure.product.entity.ProductInfoInfraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductInfoJpaRepository extends JpaRepository<ProductInfoInfraEntity, Long> {


    @Query(value = "SELECT p.PRODUCT_ID, p.PRODUCT_NAME, o.PRODUCT_OPTION_ID, o.PRODUCT_OPTION_NAME, o.PRODUCT_QUANTITY, o.PRODUCT_PRICE" +
            " FROM PRODUCT_INFO p JOIN PRODUCT_OPTION_INFO o WHERE p.PRODUCT_ID = :productId AND o.PRODUCT_OPTION_ID = :productOptionId", nativeQuery = true)
    ProductInfoInfraEntity findByProductIdAndProductOptionId(@Param("productId") long productId, @Param("productOptionId") long productOptionId);
}
