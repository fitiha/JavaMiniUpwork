package decision_tree;

import utility.Console;
import menus.UserMenu;
import operations.UserOperation;

public class UserDecisionTree {
    public static void startUserProgram() {
        UserMenu.welcomeMenu();
        int choice = (int) Console.readNumber("Enter your choice", 1, 5);
        switch (choice) {
            case 1:
                UserMenu.registerMenu();
                UserOperation.registerUser();
                break;
            case 2:
                UserMenu.findJobMenu();
                UserOperation.findJob();
                break;
            case 3:
                UserMenu.editProfileMenu();
                UserOperation.editProfile();
                break;
            case 4:
                UserMenu.faq();
                break;
            case 5:
                System.exit(0);
        }
    }
}
