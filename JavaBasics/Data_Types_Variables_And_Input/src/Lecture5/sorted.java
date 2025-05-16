package Lecture5;

public class sorted {
    public static void main(String[] args) {
        System.out.println("This program checks if the given array is sorted or not");
//        int[] arr = {3, 6, 8, 27, 85, 98, 99, 68, 34, 42, 100};
        int[] arr = {1, 6, 8, 27, 85, 98, 99, 100, 134, 142, 1001};
        printArr(arr);
        String res = isSorted(arr) ? "The given array is sorted" : "The given array is not sorted";
        System.out.println(res);
    }

    public static void printArr(int[] arr) {
        System.out.print("Given Array: [");
        for (int i = 0; i <arr.length; i++) {
            if (i!=arr.length-1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.println(arr[i] + "]");
            }
        }
    }

    public static boolean isSorted(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return true;
        }
        for (int i = 1; i<arr.length; i++) {
            if (arr[i-1] > arr[i]) {
                return false;
            }
        }
        return true;
    }
}
