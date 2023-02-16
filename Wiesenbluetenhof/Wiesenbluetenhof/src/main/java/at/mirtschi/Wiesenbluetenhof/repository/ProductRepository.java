package at.mirtschi.Wiesenbluetenhof.repository;

import at.mirtschi.Wiesenbluetenhof.datamodel.Category;
import at.mirtschi.Wiesenbluetenhof.datamodel.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    public List<Product> findProductsByCategory(Category category);

    public List<Product> findProductsByPriceBefore(Integer price);


}
