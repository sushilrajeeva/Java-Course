package Lecture5;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("This program checks if the given array is Palindrome or not");
        int[] arr = {3, 6, 8, 27, 85, 98, 99, 68, 34, 42, 100};
//        int[] arr = {1, 6, 8, 27, 85, 98, 99, 98, 85, 27, 8, 6, 1};
//        int[] arr = {1, 6, 8, 27, 85, 98, 99, 99, 98, 85, 27, 8, 6, 1};
        printArr(arr);
        String res = isPalindrome(arr) ? "The given array is a palindrome" : "The given array is not a palindrome";
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

    public static boolean isPalindrome(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left += 1;
            right -= 1;
        }
        return true;
    }
}
