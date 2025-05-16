package Lecture5;

public class Array {
    public static void main(String[] args) {
        int[] myArr = new int[5];
        for (int i = 0; i < 5; i++) {
            myArr[i] = i*5;
        }
        for (int i = 0; i < myArr.length; i++) {
            System.out.println("Index " + i + " has value " + myArr[i]);
        }
    }
}
