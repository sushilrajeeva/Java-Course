package L3_Loops_Assignment;

public class PasswordChecker {
    public static void main(String[] args) {
        System.out.println("This program runs until the user inputs a valid password!");
        passwordChecker();
    }

    public static void passwordChecker() {
        String password = "";
        do {
            password = UserInput.userInput("Enter your password : ");
            if (password.length() <= 5) {
                System.out.println("Invalid password!! length has to be more 5");
            }
        } while  (password.length() <= 5);
        System.out.println("You Entered valid password!!");
    }
}
