package hello.fifthweek.interfaces.product;


import hello.fifthweek.domain.product.ProductService;
import hello.fifthweek.interfaces.product.record.request.*;
import hello.fifthweek.interfaces.product.record.response.ProductInfoInterfacesResponse;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;



@RestController("/product")
@RequiredArgsConstructor
public class ProductController {


    private final ProductService productService;


    @PostMapping("/productRegist")
    @Operation(summary = "상품 등록")
    public boolean productRegist(@RequestBody ProductRegistInterfacesRequest productRegistInterfacesRequest) {
        return productService.productRegist(productRegistInterfacesRequest.toDomain());
    }

    @PostMapping("/productOptionRegist")
    @Operation(summary = "상품옵션 등록")
    public boolean productOptionRegist(@RequestBody ProductOptionRegistInterfacesRequest productOptionRegistInterfacesRequest) {
        return productService.productOptionRegist(productOptionRegistInterfacesRequest.toDomain());
    }

    @GetMapping("/productInfo")
    @Operation(summary = "상품정보 조회")
    public ProductInfoInterfacesResponse productInfo(@RequestParam long productId, @RequestParam long productOptionId) {
        return productService.productInfo(productId, productOptionId);
    }

    @PostMapping("/productAddHistory")
    @Operation(summary = "상품 기록 추가")
    public boolean productAddHistory(@RequestBody ProductAddHistoryInterfacesRequest productAddHistoryInterfacesRequest) {
        return productService.productAddHistory(productAddHistoryInterfacesRequest.toDomain());
    }

    @GetMapping("/productQuantity")
    @Operation(summary = "상품재고 조회")
    public int productQuantity(@RequestParam long productId, @RequestParam long productOptionId) {
        return productService.productQuantity(productId, productOptionId);
    }

    @PutMapping("/productIndeAmount")
    @Operation(summary = "상품재고 증감")
    public boolean productIndeAmount(@RequestBody ProductIndeAmountInterfacesRequest productIndeAmountInterfacesRequest) {
        return productService.productIndeAmount(productIndeAmountInterfacesRequest.toDomain());
    }
}
