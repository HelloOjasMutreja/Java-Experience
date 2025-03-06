package level_4_practice_problems;

import java.util.Scanner;

class pp9 {
    public static void main(String[] args) {
        int startValue;

        Scanner sc = new Scanner(System.in);
        System.out.println("To begin the countdown give an initial value: ");
        startValue = sc.nextInt();

        System.out.println("Beginning Launch Countdown!");
        for (int i = startValue; i > 0; i--) {
            System.out.println(i);
        }
        sc.close();
    }
}
