import java.util.*;

public class e_commerce {
//to initiate the products.
    static class Product {
        int productId;
        String productName;
        String category;

        Product(int id, String name, String category) {
            this.productId = id;
            this.productName = name;
            this.category = category;
        }

        public String toString() {
            return productId + " - " + productName + " - " + category;
        }
    }
// linear search section.
    public static Product linearSearch(Product[] products, String name) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }
// Binary search section.
    public static Product binarySearch(Product[] products, String name) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(name);
            if (cmp == 0) return products[mid];
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Product[] products = new Product[n];

        // Input product details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Product " + (i + 1));
            System.out.print("Product ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Product Name: ");
            String name = sc.nextLine();
            System.out.print("Category: ");
            String category = sc.nextLine();

            products[i] = new Product(id, name, category);
        }

        // Input search query
        System.out.print("\nEnter product name to search: ");
        String searchName = sc.nextLine();

        // Linear Search
        Product resultLinear = linearSearch(products, searchName);
        System.out.println("Linear Search Result: " + (resultLinear != null ? resultLinear : "Not Found"));

        // Binary Search (needs sorted array)
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
        Product resultBinary = binarySearch(products, searchName);
        System.out.println("Binary Search Result: " + (resultBinary != null ? resultBinary : "Not Found"));
        System.out.println("Binary search is best as it divides the array into two parts and searches, and the search time will bw reduced so it increases the optimization.");
    }
}
