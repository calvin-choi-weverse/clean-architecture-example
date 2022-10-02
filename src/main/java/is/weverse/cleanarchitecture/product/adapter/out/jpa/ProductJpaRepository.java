package is.weverse.cleanarchitecture.product.adapter.out.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJpaRepository extends JpaRepository<ProductJpaEntity, Long> {
}
