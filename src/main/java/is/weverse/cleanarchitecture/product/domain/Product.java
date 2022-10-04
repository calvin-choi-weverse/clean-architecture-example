package is.weverse.cleanarchitecture.product.domain;

import is.weverse.cleanarchitecture.product.application.port.in.ProductCommandUseCase;

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

    public void save(ProductCommandUseCase productCommandUseCase) {
        Product product = productCommandUseCase.save(this);
        this.id = product.id;
    }

    public Long getId() {
        return id;
    }

    public Integer getPrice() {
        return price;
    }
}
