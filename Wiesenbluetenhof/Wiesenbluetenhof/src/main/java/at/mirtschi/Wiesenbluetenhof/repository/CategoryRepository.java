package at.mirtschi.Wiesenbluetenhof.repository;

import at.mirtschi.Wiesenbluetenhof.datamodel.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
