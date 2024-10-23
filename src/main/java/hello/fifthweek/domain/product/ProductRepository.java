package hello.fifthweek.domain.product;


import hello.fifthweek.infrastructure.product.entity.ProductRegistEntity;
import org.springframework.stereotype.Service;

@Service
public interface ProductRepository {

    boolean productRegist(ProductRegistEntity productRegistEntity);
}
