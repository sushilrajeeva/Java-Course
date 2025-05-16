package Lecture5;

public class SumAndAverage {
    public static void main(String[] args) {
        System.out.println("This program computes the sum and average of all the elements in an given array");
        int[] arr = {3, 6, 8, 27, 85, 98, 99, 68, 34, 42, 100};
        printArr(arr);
        float sum = sum(arr);
        float avg = average(arr);
        System.out.println("sum of the given array elements is: " + sum);
        System.out.println("Average of the given array elements is: " + avg);
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

    public static float sum(int[] arr) {
        float total = 0;
        for (int ele: arr) {
            total += ele;
        }
        return total;
    }

    public static float average(int[] arr) {
        return sum(arr)/arr.length;
    }
}
