package ma.enset.collections;

import ma.enset.models.Product;
import java.util.*;

public class ProductManagementApp {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // 1
        products.add(new Product(1, "Laptop", 8000));
        products.add(new Product(2, "Phone", 4000));
        products.add(new Product(3, "Tablet", 2500));

        // 2
        products.remove(1);

        // 3
        System.out.println("Product List:");
        products.forEach(System.out::println);

        // 4
        products.set(0, new Product(1, "Gaming Laptop", 9500));

        // 5. 
        System.out.print("\nEnter product name to search: ");
        String searchName = scanner.nextLine();
        products.stream()
                .filter(p -> p.getName().equalsIgnoreCase(searchName))
                .forEach(p -> System.out.println("Found: " + p));
    }
}