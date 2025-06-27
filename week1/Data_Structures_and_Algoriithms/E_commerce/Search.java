package week1.Data_Structures_and_Algoriithms.E_commerce;

import java.util.*;


public class Search{

    // Linear Search
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.productId == targetId) {
                return product;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int targetId) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (products[mid].productId == targetId) {
                return products[mid];
            } else if (products[mid].productId < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(3, "Shoes", "Footwear"),
            new Product(1, "Laptop", "Electronics"),
            new Product(5, "Watch", "Accessories"),
            new Product(2, "Phone", "Electronics"),
            new Product(4, "Bag", "Fashion")
        };

        System.out.println("=== Linear Search ===");
        Product result1 = linearSearch(products, 4);
        System.out.println(result1 != null ? result1 : "Product not found");

        System.out.println("\n=== Binary Search ===");

        // Binary search requires sorted array
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));
        Product result2 = binarySearch(products, 4);
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}
