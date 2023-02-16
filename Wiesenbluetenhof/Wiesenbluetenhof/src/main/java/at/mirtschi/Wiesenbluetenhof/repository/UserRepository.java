package at.mirtschi.Wiesenbluetenhof.repository;

import at.mirtschi.Wiesenbluetenhof.datamodel.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
