package hello.fifthweek.infrastructure.product.jparepository;

import hello.fifthweek.infrastructure.product.entity.ProductInfoInfraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductInfoJpaRepository extends JpaRepository<ProductInfoInfraEntity, Long> {


    @Modifying
    @Query(value = "SELECT PRODUCT_ID, PRODUCT_NAME, PRODUCT_OPTION_ID, PRODUCT_OPTION_NAME, PRODUCT_QUANTITY, PRODUCT_PRICE" +
            "FROM PRODUCT_INFO p JOIN FETCH PRODUCT_OPTION_INFO WHERE p.PRODUCT_ID = :productId AND PRODUCT_OPTION_ID = :productOptionId", nativeQuery = true)
    ProductInfoInfraEntity findByProductId(@Param("productId") long productId, @Param("productOptionId") long productOptionId);
}
