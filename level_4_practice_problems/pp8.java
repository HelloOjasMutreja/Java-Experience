package level_4_practice_problems;

import java.util.Scanner;

class pp8 {
    public static void main(String[] args) {
        int startValue;

        Scanner sc = new Scanner(System.in);
        System.out.println("To begin the countdown give an initial value: ");
        startValue = sc.nextInt();

        int i = startValue;

        System.out.println("Beginning Launch Countdown!");
        while (i != 0) {
            System.out.println(i);
            i--;
        }
        sc.close();
    }
}
