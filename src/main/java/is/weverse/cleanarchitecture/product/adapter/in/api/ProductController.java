package is.weverse.cleanarchitecture.product.adapter.in.api;


import is.weverse.cleanarchitecture.product.application.port.out.ProductCommandPort;
import is.weverse.cleanarchitecture.product.application.port.out.ProductQueryPort;
import is.weverse.cleanarchitecture.product.domain.Product;
import is.weverse.cleanarchitecture.product.domain.Products;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/v1/api/products")
@RestController
class ProductController {

    private final ProductCommandPort productCommandPort;
    private final ProductQueryPort productQueryPort;

    public ProductController(ProductCommandPort productCommandPort, ProductQueryPort productQueryPort) {
        this.productCommandPort = productCommandPort;
        this.productQueryPort = productQueryPort;
    }

    @GetMapping
    public List<ProductResponse> findAll() {
        return Products.findAll(productQueryPort).stream().map(it -> new ProductResponse(it.getId(), it.getPrice())).toList();
    }

    @PostMapping
    public void create(@RequestBody ProductRequest productRequest) {
        Product product = new Product(productRequest.getPrice());
        product.save(productCommandPort);
    }
}
