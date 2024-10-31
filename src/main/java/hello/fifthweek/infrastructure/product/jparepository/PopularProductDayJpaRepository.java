package hello.fifthweek.infrastructure.product.jparepository;

import hello.fifthweek.infrastructure.product.entity.PopularProductDayEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface PopularProductDayJpaRepository extends JpaRepository<PopularProductDayEntity, Long> {

    @Query(value = "SELECT ph.PRODUCT_ID, pi.PRODUCT_NAME, SUM(ph.INDE_AMOUNT) AS TOTAL_SALES, ph.CREATED_AT" +
            " FROM PRODUCT_HISTORY ph" +
            " LEFT JOIN PRODUCT_INFO pi ON ph.PRODUCT_ID = pi.PRODUCT_ID" +
            " WHERE ph.CREATED_AT BETWEEN :startDate AND :endDate" +
            " GROUP BY ph.PRODUCT_ID, pi.PRODUCT_NAME, ph.CREATED_AT" +
            " ORDER BY TOTAL_SALES DESC"
            , nativeQuery = true)
    List<PopularProductDayEntity> findByProductId(@Param("startDate")LocalDate starDate, @Param("endDate") LocalDate endDate);
}
