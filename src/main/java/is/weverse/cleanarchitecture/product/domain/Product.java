package is.weverse.cleanarchitecture.product.domain;

import is.weverse.cleanarchitecture.product.application.port.out.ProductCommandPort;

public class Product {

    private Long id;
    private final Integer price;

    public Product(Integer price) {
        this(null, price);
    }

    public Product(Long id, Integer price) {
        this.id = id;
        this.price = price;
    }

    public void save(ProductCommandPort productCommandPort) {
        Product product = productCommandPort.save(this);
        this.id = product.id;
    }

    public Long getId() {
        return id;
    }

    public Integer getPrice() {
        return price;
    }
}
