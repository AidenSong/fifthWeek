package hello.fifthweek.infrastructure.product.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;



@Entity
@Getter
@Setter
public class PopularProductMonthEntity {


    @Id
    @Column(name = "PRODUCT_ID")
    private long productId;

    @Column(name = "PRODUCT_NAME")
    private String productName;

    @Column(name = "TOTAL_SALES")
    private int totalSales;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;
}
