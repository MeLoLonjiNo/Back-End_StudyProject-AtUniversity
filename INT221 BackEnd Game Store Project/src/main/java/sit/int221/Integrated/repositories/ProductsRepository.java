package sit.int221.Integrated.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sit.int221.Integrated.models.Products;

public interface ProductsRepository extends JpaRepository<Products, Long> {
}
