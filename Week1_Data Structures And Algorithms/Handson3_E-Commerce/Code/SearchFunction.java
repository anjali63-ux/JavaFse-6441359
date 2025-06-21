import java.util.Arrays;
import java.util.Comparator;

public class SearchFunction {

    // Linear Search: goes one by one
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product p : products) {
            if (p.productId == targetId) {
                return p;
            }
        }
        return null; // if not found
    }

    // Binary Search: as we know this search will only works on sorted list
    public static Product binarySearch(Product[] products, int targetId) {
        int low = 0, high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (products[mid].productId == targetId)
                return products[mid];
            else if (products[mid].productId < targetId)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return null; // if not found
    }

    // Main method is mandatory to run this program
    public static void main(String[] args) {
        // Create some list of products
        Product[] products = {
            new Product(103, "Shoes", "Footwear"),
            new Product(101, "Laptop", "Electronics"),
            new Product(104, "Watch", "Accessories"),
            new Product(102, "Phone", "Electronics")
        };

        // --- Linear Search ---
        System.out.println("Linear Search:");// output: Linear Search:
        Product found1 = linearSearch(products, 102);
        if (found1 != null) found1.display();//O/P: ID: 102, Name: Phone, Category: Electronics
        else System.out.println("Product not found");

        // --- Binary Search ---
        // First, sort products by ID i.e, 103, 101, 104, 102
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        System.out.println("\nBinary Search:");// output: Binary Search
        Product found2 = binarySearch(products, 102);
        if (found2 != null) found2.display();// O/P: ID: 102, Name: Phone, Category: Electronics
        else System.out.println("Product not found");// if not found any ID
    }
}
