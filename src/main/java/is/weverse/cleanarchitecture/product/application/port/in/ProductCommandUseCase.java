package is.weverse.cleanarchitecture.product.application.port.in;

import is.weverse.cleanarchitecture.product.domain.Product;

public interface ProductCommandUseCase {
    Product save(Product product);
}
