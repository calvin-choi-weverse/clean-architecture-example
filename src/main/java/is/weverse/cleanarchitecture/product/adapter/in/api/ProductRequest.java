package is.weverse.cleanarchitecture.product.adapter.in.api;

class ProductRequest {

    private final Integer price;

    private ProductRequest() {
        this(0);
    }

    public ProductRequest(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }
}
