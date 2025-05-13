public class ReverseLeftHalfPyramid {
    public static void main(String[] args) {
        int n = 5;

        // i goes from n down to 1
        for (int i = n; i >= 1; i--) {
            // print i stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
