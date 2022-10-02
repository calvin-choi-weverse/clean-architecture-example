package is.weverse.cleanarchitecture.product.application.port.out;

import is.weverse.cleanarchitecture.product.domain.Product;

import java.util.List;

public interface ProductQueryPort {
    List<Product> findAll();
}
