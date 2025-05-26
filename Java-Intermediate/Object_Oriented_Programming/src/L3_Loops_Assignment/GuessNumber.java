package L3_Loops_Assignment;

public class GuessNumber {
    public static void main(String[] args) {
        System.out.println("This program allows user to keep guessing a number until they get it right");
        int number = 11;
        keepGuessing(number);
    }

    public static void keepGuessing(int num) {
        boolean flag = true;
        do {
            int guess = UserInput.userInput("", "Enter your guess : ");
            if (guess == num) {
                System.out.println("You guessed the number!!");
                flag = false;
            }
            else {
                String clue = guess < num ? "Your guess is too low!" : "Your guess is too high!";
                System.out.println(clue);
            }
        } while (flag);
    }
}
