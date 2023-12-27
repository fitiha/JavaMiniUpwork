package operations;

import java.util.Scanner;

import menus.UserMenu;

public class UserOperation {

    private static final Scanner scanner = new Scanner(System.in);
    private static User user;

    private static boolean emailFound = false;

    public static void registerUser() {

    }

    public static void findJob() {

    }

    public static void editProfile() {
        int choice = (int) Console.readNumber("Enter your choice", 1, 4);
        switch (choice) {
            case 1:
                editName();
                break;
            case 2:
                editProfession();
                break;
            case 3:
                editAge();
                break;
            case 4:
                UserMenu.welcomeMenu();
        }
    }

    public static void editName() {
        System.out.print("Enter the new name: ");
        String name = scanner.nextLine();
        User.setName(name);
    }

    public static void editProfession() {

    }

    public static void editAge() {

    }

    public static void logIn() {
        while (true) {
            System.out.print("Enter your email: ");
            String email = scanner.nextLine();
            for (int i = 0; i < Lists.users.size(); i++)
                if (email.equals(Lists.users.get(i).getEmail())) {
                    user = Lists.users.get(i);
                    emailFound = true;
                    break;
                }
            if (emailFound)
                break;
            System.out.println("There is no account with such email or phone number. Please try again.");
        }
        while (true) {
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();
            if (password.equals(user.getPassword()))
                break;
            System.out.println("The entered password is incorrect. Please try again.");
        }
    }

    // ================ Getters ===================
    public static User getUser() {
        return user;
    }
}
