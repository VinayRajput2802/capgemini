import java.util.ArrayList;
import java.util.Scanner;

public class DigitalcomProcess implements Ivalidate{
    static ArrayList<User> users = new ArrayList<>();
    public static void main(String[] args) {
        Ivalidate ivalidate = new DigitalcomProcess();
        String[] choices = {"Register User","View Games","SearchByName","Exit"};
        System.out.println("Enter your choice: ");
        Scanner input = new Scanner(System.in);
        GameServices gameServices = new GameServices();
        while (true) {
            for (int i = 0; i < choices.length; i++) {
                System.out.println(i+1+" --------- "+choices[i]);
            }
            int choice = input.nextInt();
            input.nextLine();
            if (choice == 1) {
                System.out.println("Enter username: ");
                String username = input.nextLine();
                System.out.println("Enter password: ");
                String password = input.nextLine();
                if (ivalidate.isAuthenticated(username,password)){
                    System.out.println("You are already logged in");
                }
                else {
                    User user = new User();
                    users.add(user.addUser(username,password));
                }
            }
            else if (choice == 2) {
                gameServices.viewAllGames();
            }
            else if (choice == 3) {
                System.out.println("Enter Author Name: ");
                String author_name = input.nextLine();
                System.out.println(gameServices.AuthorSearch(author_name));
            }
            else if (choice == 4) {
                System.out.println("Thank you for using our game");
                break;
            }
            else{
                System.out.println("Invalid choice");
            }
        }
    }

    @Override
    public boolean isAuthenticated(String username, String password) {
        for (User user : users) {
            if (user.getName().equals(username)){
                return false;
            }
        }return true;
    }
}
//hello world
