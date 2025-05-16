package Lecture5;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        System.out.println("This program merges the two sorted arrays");
        int[] arr1 = {1, 6, 8, 27, 85, 98, 99, 100, 134, 142, 1001};
        int[] arr2 = {3, 6, 8, 27, 85, 98, 99, 100};
        System.out.print("First Sorted ");
        printArr(arr1);
        System.out.print("Second Sorted ");
        printArr(arr2);
        int[] res = merge(arr1, arr2);
        System.out.print("Merged Sorted ");
        printArr(res);

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

    public static int[] merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        if (n>m) {
            return merge(arr2, arr1);
        }

        int[] res = new int[n+m];
        int i = 0;
        int j = 0;
        int cur = 0;
        while (i < n || j < m) {
            if (i == n) {
                res[cur] = arr2[j];
                j += 1;
            } else if (j == m) {
                res[cur] = arr1[i];
                i += 1;
            } else if (arr1[i] < arr2[j]) {
                res[cur] = arr1[i];
                i += 1;
            } else {
                res[cur] = arr2[j];
                j += 1;
            }
            cur += 1;
        }
        return res;
    }
}
