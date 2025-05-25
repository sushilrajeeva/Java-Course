package Switch_Conditions;

import java.util.Scanner;

public class OldSwitch {

    public static int getUserInputDay() {
        System.out.println("Please Enter a day from 1 to 7 to check the day");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static void oldSwitch(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                // fall through
            case 7:
                System.out.println("Holiday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println("Old Switch Statement");
        int day = getUserInputDay();
        oldSwitch(day);
    }
}
