package hello.fifthweek.domain.product;


import hello.fifthweek.infrastructure.product.entity.ProductOptionRegistInfraEntity;
import hello.fifthweek.infrastructure.product.entity.ProductRegistInfraEntity;
import org.springframework.stereotype.Service;

@Service
public interface ProductRepository {

    boolean productRegist(ProductRegistInfraEntity productRegistInfraEntity);

    boolean productOptionRegist(ProductOptionRegistInfraEntity productOptionRegistInfraEntity);
}
