// Class to represent a product
public class Product {
    // assume given attributes
    String id;
    String name;
    int quantity;
    double price;

    // Constructor to initialize product
    public Product(String id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Display product details
    public String toString() {
        return id + ": " + name + " | Qty: " + quantity + " | Rs: " + price; //it returns P1: Gel pen | Qty: 120 | Rs: 12.5
    }
}
