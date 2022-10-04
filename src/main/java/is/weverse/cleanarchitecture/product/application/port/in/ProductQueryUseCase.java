package is.weverse.cleanarchitecture.product.application.port.in;

import is.weverse.cleanarchitecture.product.domain.Product;

import java.util.List;

public interface ProductQueryUseCase {
    List<Product> findAll();
}
