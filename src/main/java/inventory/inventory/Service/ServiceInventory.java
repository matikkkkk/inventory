package inventory.inventory.Service;

import org.springframework.stereotype.Service;

import inventory.inventory.Model.inventory.Inventory;
import inventory.inventory.Repository.Repositoryinventory;
import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class ServiceInventory {
  private final Repositoryinventory repository;

    public Inventory getByMoto(Long motoId) {

        return repository.findByMotoId(motoId)
                .orElseThrow();
    }

    public void discountStock(Long motoId, Integer quantity) {

        Inventory inventory = repository.findByMotoId(motoId)
                .orElseThrow();

        inventory.setStock(
                inventory.getStock() - quantity
        );

        repository.save(inventory);
    }
}
