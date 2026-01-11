package ma.enset.generics;
import ma.enset.models.Product;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        MetierProduitImpl manager = new MetierProduitImpl();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        System.out.println("Welcome to the Product Management System");

        while (choice != 5) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Display all products");
            System.out.println("2. Search for a product by ID");
            System.out.println("3. Add a new product");
            System.out.println("4. Delete a product by ID");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("\n--- Product List ---");
                    manager.getAll().forEach(System.out::println);
                }
                case 2 -> {
                    System.out.print("Enter Product ID: ");
                    long id = scanner.nextLong();
                    Product p = manager.findById(id);
                    System.out.println(p != null ? p : "Product not found");
                }
                case 3 -> {
                    System.out.print("Name: "); 
                    String name = scanner.nextLine();
                    System.out.print("Price: "); 
                    double price = scanner.nextDouble();
                    
                    manager.add(new Product(System.currentTimeMillis(), name, price));
                    System.out.println("Product added successfully!");
                }
                case 4 -> {
                    System.out.print("Enter ID to delete: ");
                    long id = scanner.nextLong();
                    manager.delete(id);
                    System.out.println("Operation completed");
                }
                case 5 -> System.out.println("Exiting... Goodbye!");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close(); 
    }
}