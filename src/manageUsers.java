import java.util.*;

public void ManageUsers() throws InterruptedException {
    System.out.println("1. View Users\n2. Add User\n3. Remove User");
    Scanner scanner = new Scanner(System.in);
    int choice = scanner.nextInt();
    scanner.nextLine(); // Consume newline
    switch (choice) {
        case 1:
            System.out.println("Users:");
            String[] users = new String[0];
            for (String user : users) {
                System.out.println(user);
            }
            break;
        case 2:
            System.out.println("Enter new user name:");
            String newUser = scanner.nextLine();
            users.wait(Long.parseLong(newUser));
            System.out.println("User added successfully.");
            break;
        case 3:
            System.out.println("Enter user name to remove:");
            String removeUser = scanner.nextLine();
            if (users.remove(removeUser)) {
                System.out.println("User removed successfully.");
            } else {
                System.out.println("User not found.");
            }
            break;
        default:
            System.out.println("Invalid choice.");
    }
}

public void main() {
}
