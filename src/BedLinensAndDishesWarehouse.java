import java.util.ArrayList;
import java.util.Scanner;

public class BedLinensAndDishesWarehouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        manageItems manageItems = new manageItems();

        Administrator admin = new Administrator("admin", "password123");
        ArrayList<String> users = new ArrayList<>();
        ArrayList<String> items = new ArrayList<>();

        System.out.println("Welcome to the Warehouse Management System");

        System.out.print("Enter admin username: ");
        String username = scanner.nextLine();
        System.out.print("Enter admin password: ");
        String password = scanner.nextLine();

        if (admin.authenticate(username, password)) {
            System.out.println("Login successful. Access granted.");
            boolean running = true;
            while (running) {
                System.out.println("\nAdmin Menu:");
                System.out.println("1. Manage Users\n2. Manage Items\n3. Exit");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                switch (choice) {
                    case 1:
                        admin.manageUsers(users, scanner);
                        break;
                    case 2:
                        manageItems.manageItems(items, scanner);
                        break;
                    case 3:
                        System.out.println("Exiting system. Goodbye!");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } else {
            System.out.println("Invalid credentials. Access denied.");
        }

        scanner.close();
    }
}
