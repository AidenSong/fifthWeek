package hello.fifthweek.domain.product;


import hello.fifthweek.domain.product.record.request.ProductOptionRegistDomainRequest;
import hello.fifthweek.domain.product.record.request.ProductRegistDomainRequest;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductService {


    private final ProductRepository productRepository;


    public boolean productRegist(ProductRegistDomainRequest productRegistDomainRequest) {
        return productRepository.productRegist(productRegistDomainRequest.toEntity());
    }

    public boolean productOptionRegist(ProductOptionRegistDomainRequest productOptionRegistDomainRequest) {
        return productRepository.productOptionRegist(productOptionRegistDomainRequest.toEntity());
    }
}
