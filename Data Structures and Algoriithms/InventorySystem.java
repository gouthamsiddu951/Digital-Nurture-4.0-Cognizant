import java.util.*;
public class InventorySystem {

    // Product class : This is to initiate products.
    static class Product {
        private int productId;
        private String productName;
        private int quantity;
        private double price;

        public Product(int productId, String productName, int quantity, double price) {
            this.productId = productId;
            this.productName = productName;
            this.quantity = quantity;
            this.price = price;
        }

        public int getProductId() { return productId; }
        public String getProductName() { return productName; }
        public int getQuantity() { return quantity; }
        public double getPrice() { return price; }
        public void setQuantity(int quantity) { this.quantity = quantity; }
        public void setPrice(double price) { this.price = price; }
        public String toString() {
            return "Product ID: " + productId + ", Name: " + productName +
                   ", Quantity: " + quantity + ", Price: Rs. " + price;
        }
    }

    // I used Hash Map to access the products.
    static HashMap<Integer, Product> inventory = new HashMap<>();

    // This section adds the products.
    public static void addProduct(int id, String name, int qty, double price) {
        Product p = new Product(id, name, qty, price);
        inventory.put(id, p);
        System.out.println("Product added successfully.");
    }

    // This section is to update product.
    public static void updateProduct(int id, int qty, double price) {
        Product p = inventory.get(id);
        if (p != null) {
            p.setQuantity(qty);
            p.setPrice(price);
            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    // This section is to delete product.
    public static void deleteProduct(int id) {
        if (inventory.remove(id) != null) {
            System.out.println("Product deleted successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    // This section is to display inventory.
    public static void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Product p : inventory.values()) {
                System.out.println(p);
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Inventory Management ---");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. View Inventory");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID, Name, Quantity, Price: ");
                    int id = sc.nextInt();
                    String name = sc.next();
                    int qty = sc.nextInt();
                    double price = sc.nextDouble();
                    addProduct(id, name, qty, price);
                    break;
                case 2:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    System.out.print("Enter new Quantity and Price: ");
                    int newQty = sc.nextInt();
                    double newPrice = sc.nextDouble();
                    updateProduct(uid, newQty, newPrice);
                    break;
                case 3:
                    System.out.print("Enter ID to delete: ");
                    int did = sc.nextInt();
                    deleteProduct(did);
                    break;
                case 4:
                    displayInventory();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        sc.close();
    }
}
