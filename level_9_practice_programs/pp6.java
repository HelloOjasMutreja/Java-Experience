package level_9_practice_programs;

import java.util.Scanner;

class SpringSeason {
    public static String calendar(int dd, int mm) {
        String bloom = "";
        if ((mm == 3 && dd >= 20) || (mm == 6 && dd <= 20) || (mm > 3 && mm < 6)) {
            bloom = "Its a Sprint Season";
        } else {
            bloom = "Not a Spring Season";
        }

        return bloom;
    }

    public static void main(String[] args) {
        int month, day;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the month (1 for Jan, 2 for Feb, 3 for Mar...)");
        month = sc.nextInt();

        System.out.println("Enter the date: ");
        day = sc.nextInt();

        sc.close();

        System.out.println(calendar(day, month));
    }
}
