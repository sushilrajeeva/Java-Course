package Lecture5;

public class reverseArr {
    public static void main(String[] args) {
        System.out.println("This program reverses the given array");
//        int[] arr = {3, 6, 8, 27, 85, 98, 99, 68, 34, 42, 100};
        int[] arr = {1, 6, 8, 27, 85, 98, 99, 100, 134, 142, 1001};
        System.out.println("Before reversal");
        printArr(arr);
        revereseArr(arr);
        System.out.println("After reversal");
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        System.out.print("Array: [");
        for (int i = 0; i <arr.length; i++) {
            if (i!=arr.length-1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.println(arr[i] + "]");
            }
        }
    }

    public static void revereseArr(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left += 1;
            right -= 1;
        }
    }


}
