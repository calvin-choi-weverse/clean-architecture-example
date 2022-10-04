package is.weverse.cleanarchitecture.product.adapter.out.jpa;

import is.weverse.cleanarchitecture.product.application.port.out.ProductCommandOutPort;
import is.weverse.cleanarchitecture.product.application.port.out.ProductQueryOutPort;
import is.weverse.cleanarchitecture.product.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
class ProductJpaAdapter implements ProductCommandOutPort, ProductQueryOutPort {

    private final ProductJpaRepository productJpaRepository;

    public ProductJpaAdapter(ProductJpaRepository productJpaRepository) {
        this.productJpaRepository = productJpaRepository;
    }

    @Override
    public Product save(Product product) {
        ProductJpaEntity productJpaEntity = new ProductJpaEntity(product.getId(), product.getPrice());
        productJpaRepository.save(productJpaEntity);
        return new Product(productJpaEntity.getId(), productJpaEntity.getPrice());
    }

    @Override
    public List<Product> findAll() {
        return productJpaRepository.findAll().stream().map(it -> new Product(it.getId(), it.getPrice())).toList();
    }
}
