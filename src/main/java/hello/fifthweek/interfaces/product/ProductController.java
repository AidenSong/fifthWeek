package hello.fifthweek.interfaces.product;


import hello.fifthweek.domain.product.ProductService;
import hello.fifthweek.interfaces.product.record.request.ProductOptionRegistInterfacesRequest;
import hello.fifthweek.interfaces.product.record.request.ProductRegistInterfacesRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequiredArgsConstructor
public class ProductController {


    private final ProductService productService;


    @PostMapping("/productRegist")
    public boolean productRegist(@RequestBody ProductRegistInterfacesRequest productRegistInterfacesRequest) {
        return productService.productRegist(productRegistInterfacesRequest.toDomain());
    }

    @PostMapping("/productOptionRegist")
    public boolean productOptionRegist(@RequestBody ProductOptionRegistInterfacesRequest productOptionRegistInterfacesRequest) {
        return productService.productOptionRegist(productOptionRegistInterfacesRequest.toDomain());
    }


}
