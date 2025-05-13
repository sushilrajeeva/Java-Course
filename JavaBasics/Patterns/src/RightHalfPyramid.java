public class RightHalfPyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // leading spaces to shift stars to the right
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // print i stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
