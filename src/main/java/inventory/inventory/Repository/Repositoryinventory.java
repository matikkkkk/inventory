package inventory.inventory.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import inventory.inventory.Model.inventory.Inventory;

public interface Repositoryinventory extends JpaRepository<Inventory, Long> {
 Optional<Inventory> findByMotoId(Long motoId);
}
