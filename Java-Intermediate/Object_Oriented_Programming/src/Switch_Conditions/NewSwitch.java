package Switch_Conditions;

import java.util.Scanner;

public class NewSwitch {

    public static int getUserInputDay() {
        System.out.println("Please Enter a day from 1 to 7 to check the day");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static void newSwitch(int day) {
        String dayStr = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6, 7 -> "Holiday";
            default -> "Invalid";
        };

        System.out.println(dayStr);

    }

    public static void main(String[] args) {
        System.out.println("New Switch Statement");
        int day = getUserInputDay();
        newSwitch(day);
    }
}
