package is.weverse.cleanarchitecture.product.application.port.out;

import is.weverse.cleanarchitecture.product.domain.Product;

public interface ProductCommandOutPort {
    Product save(Product product);
}
