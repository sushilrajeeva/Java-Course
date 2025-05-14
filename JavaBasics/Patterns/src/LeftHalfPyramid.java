import java.util.Scanner;

public class LeftHalfPyramid {
    public static void main(String[] args) {
//        int n = 5;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of your Left Half Pyramid: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            // print i stars, each followed by a space
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
