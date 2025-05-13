public class LeftHalfPyramid {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // print i stars, each followed by a space
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
