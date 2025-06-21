// A product class with 3 details
public class Product {
    int productId;
    String productName;
    String category;

    // create Constructor by passing parameters ID, name and category
    public Product(int productId, String productname, String category) {
        this.productId = productId;
        this.productName = productname;
        this.category = category;
    }

    // Print product details
    public void display() {
        System.out.println("ID: " + productId + ", Name: " + productName + ", Category: " + category);
    }
}
