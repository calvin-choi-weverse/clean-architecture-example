package is.weverse.cleanarchitecture.product.adapter.in.api;


import is.weverse.cleanarchitecture.product.application.port.in.ProductCommandUseCase;
import is.weverse.cleanarchitecture.product.application.port.in.ProductQueryUseCase;
import is.weverse.cleanarchitecture.product.domain.Product;
import is.weverse.cleanarchitecture.product.domain.Products;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/v1/api/products")
@RestController
class ProductController {

    private final ProductCommandUseCase productCommandUseCase;
    private final ProductQueryUseCase productQueryUseCase;

    public ProductController(ProductCommandUseCase productCommandUseCase, ProductQueryUseCase productQueryUseCase) {
        this.productCommandUseCase = productCommandUseCase;
        this.productQueryUseCase = productQueryUseCase;
    }

    @GetMapping
    public List<ProductResponse> findAll() {
        return Products.findAll(productQueryUseCase).stream().map(it -> new ProductResponse(it.getId(), it.getPrice())).toList();
    }

    @PostMapping
    public void create(@RequestBody ProductRequest productRequest) {
        Product product = new Product(productRequest.getPrice());
        product.save(productCommandUseCase);
    }
}
