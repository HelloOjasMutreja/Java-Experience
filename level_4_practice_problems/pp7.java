package level_4_practice_problems;

import java.util.Scanner;

class SpringSeason {
    public static void main(String[] args) {
        int month, day;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the month (1 for Jan, 2 for Feb, 3 for Mar...)");
        month = sc.nextInt();

        System.out.println("Enter the date: ");
        day = sc.nextInt();

        if ((month == 3 && day >= 20) || (month == 6 && day <= 20) || (month > 3 && month < 6)) {
            System.out.println("Its a Sprint Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        sc.close();
    }
}
