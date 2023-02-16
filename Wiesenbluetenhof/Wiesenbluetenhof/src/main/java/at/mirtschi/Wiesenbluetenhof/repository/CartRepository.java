package at.mirtschi.Wiesenbluetenhof.repository;

import at.mirtschi.Wiesenbluetenhof.datamodel.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
}
