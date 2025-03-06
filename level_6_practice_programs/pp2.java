package level_6_practice_programs;

import java.util.Scanner;

class pp2 {
    public static void main(String[] args) {
        int year = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year (after 1582 AD)");
        while (year < 1582) {
            year = sc.nextInt();
        }

        if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
            System.out.println("The year " + year + " is a leap year");
        } else {
            System.out.println("The year " + year + " is not a leap year");
        }
        sc.close();
    }
}
