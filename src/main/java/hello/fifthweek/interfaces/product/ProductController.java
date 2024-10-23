package hello.fifthweek.interfaces.product;


import hello.fifthweek.domain.product.ProductService;
import hello.fifthweek.interfaces.product.record.ProductRegistInterfacesRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequiredArgsConstructor
public class ProductController {


    private final ProductService productService;



    public boolean productRegist(@RequestBody ProductRegistInterfacesRequest productRegistInterfacesRequest) {
        return productService.productRegist(productRegistInterfacesRequest.toDomain());
    }


}
