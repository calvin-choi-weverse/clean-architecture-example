package is.weverse.cleanarchitecture.product.domain;

import is.weverse.cleanarchitecture.product.application.port.in.ProductQueryUseCase;

import java.util.List;

public class Products {

    public static List<Product> findAll(ProductQueryUseCase productQueryUseCase) {
        return productQueryUseCase.findAll();
    }
}
