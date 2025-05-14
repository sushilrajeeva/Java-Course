package Lecture1;

public class Swap {
    public static void main(String[] args) {
        // This swaps two values
        int a = 5;
        int b = 10;
        System.out.println("Val A: " + a + " Val B: " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping Val A: " + a + " Val B: " + b);
    }
}
