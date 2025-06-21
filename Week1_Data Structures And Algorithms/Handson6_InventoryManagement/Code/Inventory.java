import java.util.*;// util package for Hashmap

// Inventory system using HashMap
public class Inventory {
    // HashMap to store products using product ID as key
    HashMap<String, Product> store = new HashMap<>();

    // Add or update a product
    void addProduct(Product p) {
        store.put(p.id, p); // adds or replaces product with same ID
        System.out.println("Added/Inserted: " + p.id);
    }

    // Delete a product by ID
    void deleteProduct(String id) {
        if (store.remove(id) != null)
            System.out.println("Deleted: " + id);
        else
            System.out.println("Product not found!");
    }

    // Show all products
    void showAll() {
        for (Product p : store.values())
            System.out.println(p);
    }

    // Main method to test
    public static void main(String[] args) {
        // create Inventory object
        Inventory inv = new Inventory();

        // Adding products and thier configuartions
        inv.addProduct(new Product("P1", "Bottle", 100, 30.0));
        inv.addProduct(new Product("P2", "Pencil", 50, 10.0));

        // Updating existing product
        inv.addProduct(new Product("P1", "Marker", 120, 20.0));

        // Show inventory
        inv.showAll();

        // Delete a product
        inv.deleteProduct("P2");
        inv.showAll();
    }
}
