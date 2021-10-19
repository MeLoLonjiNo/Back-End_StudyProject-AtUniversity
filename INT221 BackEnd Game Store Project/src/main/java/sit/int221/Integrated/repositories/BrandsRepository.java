package sit.int221.Integrated.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sit.int221.Integrated.models.Brands;


public interface BrandsRepository extends JpaRepository<Brands, Long> {
}
