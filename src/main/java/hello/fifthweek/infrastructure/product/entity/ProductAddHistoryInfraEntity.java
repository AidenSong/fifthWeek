package hello.fifthweek.infrastructure.product.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "PRODUCT_HISTORY")
public class ProductAddHistoryInfraEntity {

    @Id
    @Column(name = "PRODUCT_ID")
    private long producId;

    @Column(name = "INDE_AMOUNT")
    private int indeAmount;

    @Column(name = "INDE_QUANTITY")
    private int indeQuantity;

    @Column(name = "CREATE_AT")
    private LocalDateTime createAt;
}
