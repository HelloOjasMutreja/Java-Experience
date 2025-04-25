package level_10_practice_programs;

import java.util.Scanner;

class LeapYearChecker {

    public static boolean isLeapYear(int year) {
        if (year < 1582)
            return false;
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        sc.close();

        if (isLeapYear(year))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
}