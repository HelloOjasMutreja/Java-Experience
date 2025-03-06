package level_6_practice_programs;

import java.util.Scanner;

class DayOfWeek {
    public static void main(String[] args) {
        int y, yO, d, dO, m, mO;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        y = sc.nextInt();
        System.out.print("Enter the month (1:Jan, 2:Feb, 3:Mar...): ");
        m = sc.nextInt();
        System.out.print("Enter the day: ");
        d = sc.nextInt();
        sc.close();

        yO = y - (14 - m) / 12;
        int x = yO + yO / 4 - yO / 100 + yO / 400;
        mO = m + 12 * ((14 - m) / 12) - 2;
        dO = (d + x + 31 * mO / 12) % 7;

        String day = "";

        switch (dO) {
            case 1:
                day = "Monday";
                break;

            case 2:
                day = "Tuesday";
                break;

            case 3:
                day = "Wednesday";
                break;

            case 4:
                day = "Thursday";
                break;

            case 5:
                day = "Friday";
                break;

            case 6:
                day = "Saturday";
                break;

            case 7:
                day = "Sunday";
                break;
        }

        System.out.println("The day of the week is " + day);
    }
}
