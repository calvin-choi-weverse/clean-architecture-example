package is.weverse.cleanarchitecture.product.domain;

import is.weverse.cleanarchitecture.product.application.port.out.ProductQueryPort;

import java.util.List;

public class Products {

    public static List<Product> findAll(ProductQueryPort productQueryPort) {
        return productQueryPort.findAll();
    }
}
