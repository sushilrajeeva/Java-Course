package Lecture5;

public class MaxAndMin {
    public static void main(String[] args) {
        System.out.println("This program computes the max and min elements in an given array");
        int[] arr = {3, 6, 8, 27, 85, 98, 99, 68, 34, 42, 100};
        printArr(arr);
        int max = findMax(arr);
        int min = findMin(arr);
        System.out.println("Max element in the given array is: " + max);
        System.out.println("Min element in the given array is: " + min);
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

    public static int findMax(int[] arr) {
        int maxVal = Integer.MIN_VALUE;
        for (int ele : arr) {
            if (maxVal < ele) {
                maxVal = ele;
            }
        }
        return maxVal;
    }

    public static int findMin(int[] arr) {
        int minVal = Integer.MAX_VALUE;
        for (int ele : arr) {
            if (minVal > ele) {
                minVal = ele;
            }
        }
        return minVal;
    }
}
