package nl.lucemans.ninventory;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

public class NInventoryHolder implements InventoryHolder {

    Integer id = 0;

    NInventoryHolder(Integer id) {
        this.id = id;
    }

    public Inventory getInventory() {
        return null;
    }
}
