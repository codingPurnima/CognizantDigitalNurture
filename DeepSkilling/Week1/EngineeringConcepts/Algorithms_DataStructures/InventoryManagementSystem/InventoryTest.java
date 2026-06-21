public class InventoryTest {
    public static void main(String[] args) {

        InventorySystem system = new InventorySystem();

        system.addProduct(new InventoryProduct(1, "Laptop", 10, 50000));
        system.addProduct(new InventoryProduct(2, "Mouse", 50, 500));

        system.updateProduct(1, 8, 48000);

        system.deleteProduct(2);

        system.showInventory();
    }
}