import java.util.ArrayList;
import java.util.Scanner;

public class manageItems {
    private ArrayList<String> items;

    public manageItems(ArrayList<String> items) {
        this.items = items;
    }

    public manageItems() {

    }

    // Method to manage the items (view, add, remove)
    public void manageItems(ArrayList<String> items, Scanner scanner) {
        scanner = new Scanner(System.in);
        System.out.println("1. View Items\n2. Add Item\n3. Remove Item");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        switch (choice) {
            case 1:
                System.out.println("Items:");
                if (this.items.isEmpty()) {
                    System.out.println("No items available.");
                } else {
                    for (String item : this.items) {
                        System.out.println(item);
                    }
                }
                break;
            case 2:
                System.out.println("Enter new item name:");
                String newItem = scanner.nextLine();
                this.items.add(newItem);
                System.out.println("Item added successfully.");
                break;
            case 3:
                System.out.println("Enter item name to remove:");
                String removeItem = scanner.nextLine();
                if (this.items.remove(removeItem)) {
                    System.out.println("Item removed successfully.");
                } else {
                    System.out.println("Item not found.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }


}
