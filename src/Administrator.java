import java.util.ArrayList;
import java.util.Scanner;

class Administrator extends User {

    public Administrator(String username, String password) {
        super(username, password);
    }

    public boolean authenticate(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public void manageUsers(ArrayList<String> users, Scanner scanner) {

    }
}