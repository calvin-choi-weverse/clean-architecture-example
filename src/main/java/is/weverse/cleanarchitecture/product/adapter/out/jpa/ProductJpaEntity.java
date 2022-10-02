package is.weverse.cleanarchitecture.product.adapter.out.jpa;

import javax.persistence.*;

@Entity
@Table(name = "products")
class ProductJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer price;

    protected ProductJpaEntity() {

    }

    public ProductJpaEntity(Long id, Integer price) {
        this.id = id;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public Integer getPrice() {
        return price;
    }

}
