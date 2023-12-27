package menus;

public class UserMenu {

    // ====================== Welcome Menu and Submenus ======================
    public static void welcomeMenu() {
        System.out.println("Welcome Menu");
        System.out.println("What would you like to do");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. FAQ");
        System.out.println("4. Exit");
    }

    public static void registerMenu() {
        System.out.println("Welcome Menu > Register");
        System.out.println("Enter your credentials to Register");
    }

    public static void loginMenu() {
        System.out.println("Welcome Menu > Login");
        System.out.println("Enter your credentials to log in");
    }

    public static void faq() {
        System.out.println("Welcome Menu > FAQ");
    }

    // ====================== User Main Menu ======================

    public static void userMainMenu() {
        System.out.println("Welcome Menu > Login > User Main Menu");
        System.out.println("1. Find a job");
        System.out.println("2. Edit your profile");
        System.out.println("");
    }

    // ====================== Find Job Menu and Submenus ======================

    public static void findJobMenu() {
        System.out.println("Welcome Menu > Find a job");
        System.out.println("Enter your profession");
    }

    // ====================== Edit Profile Menu and Submenus ======================

    public static void editProfileMenu() {
        System.out.println("Welcome Menu > Edit Profile");
        System.out.println("1. Edit username");
        System.out.println("2. Edit profession");
        System.out.println("3. Edit age");
        System.out.println("4. Welcome Menu");
    }

    public static void editUsernameMenu() {
        System.out.println("Welcome Menu > Edit Profile > Username");
    }

    public static void editProfessionMenu() {
        System.out.println("Welcome Menu > Edit Profile > Profession");
    }

    public static void editAgeMenu() {
        System.out.println("Welcome Menu > Edit Profile > Age");
    }

}
