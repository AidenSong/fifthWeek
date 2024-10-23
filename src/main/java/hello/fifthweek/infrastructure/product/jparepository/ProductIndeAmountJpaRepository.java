package hello.fifthweek.infrastructure.product.jparepository;

import hello.fifthweek.infrastructure.product.entity.ProductIndeAmountInfraEntity;
import hello.fifthweek.infrastructure.product.entity.ProductInfoInfraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductIndeAmountJpaRepository extends JpaRepository<ProductIndeAmountInfraEntity, Long> {


    //    @Query("SELECT p FROM ProductInfoEntity p JOIN FETCH p.options WHERE p.id = :productId")
    @Query(value = "SELECT PRODUCT_ID, PRODUCT_NAME, PRODUCT_OPTION, PRODUCT_QUANTITY FROM PRODUCT_INFO p JOIN FETCH PRODUCT_OPTION_INFO WHERE p.PRODUCT_ID = :productId AND PRODUCT_OPTION_INFO = :productOption", nativeQuery = true)
    ProductIndeAmountInfraEntity findByProductId(@Param("productId") Long productId, @Param("productOption") String productOption);

}
