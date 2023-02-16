package at.mirtschi.Wiesenbluetenhof.repository;

import at.mirtschi.Wiesenbluetenhof.datamodel.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends JpaRepository<Position, Long> {


}
