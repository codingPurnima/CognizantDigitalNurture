import java.util.HashMap;

public class InventorySystem {

    private HashMap<Integer, InventoryProduct> inventory = new HashMap<>();

    // Add product
    public void addProduct(InventoryProduct p) {
        inventory.put(p.productId, p);
    }

    // Update product
    public void updateProduct(int id, int quantity, double price) {
        if (inventory.containsKey(id)) {
            InventoryProduct p = inventory.get(id);
            p.quantity = quantity;
            p.price = price;
        }
    }

    // Delete product
    public void deleteProduct(int id) {
        inventory.remove(id);
    }

    // Display
    public void showInventory() {
        for (InventoryProduct p : inventory.values()) {
            System.out.println(p);
        }
    }
}