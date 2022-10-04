package is.weverse.cleanarchitecture.product.application.service;

import is.weverse.cleanarchitecture.product.application.port.in.ProductCommandUseCase;
import is.weverse.cleanarchitecture.product.application.port.in.ProductQueryUseCase;
import is.weverse.cleanarchitecture.product.application.port.out.ProductCommandOutPort;
import is.weverse.cleanarchitecture.product.application.port.out.ProductQueryOutPort;
import is.weverse.cleanarchitecture.product.domain.Product;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
class ProductService implements ProductCommandUseCase, ProductQueryUseCase {

    private ProductCommandOutPort productCommandOutPort;
    private ProductQueryOutPort productQueryOutPort;

    ProductService(ProductCommandOutPort productCommandOutPort, ProductQueryOutPort productQueryOutPort) {
        this.productCommandOutPort = productCommandOutPort;
        this.productQueryOutPort = productQueryOutPort;
    }

    @Transactional
    @Override
    public Product save(Product product) {
        return productCommandOutPort.save(product);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Product> findAll() {
        return productQueryOutPort.findAll();
    }
}
