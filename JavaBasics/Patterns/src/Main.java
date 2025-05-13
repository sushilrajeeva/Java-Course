public class Main {
    public static void main(String[] args) {
        int n = 5;  // height of the triangle

        for (int i = 1; i <= n; i++) {
            // 1) print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 2) print stars with a space after each
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            // move to next line
            System.out.println();
        }
    }
}
