package level_9_practice_programs;

import java.util.Scanner;

class SimpleInterestCalc {
    public static int calculator(int p, int r, int t) {
        int s = (p * r * t) / 100;
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Principle: ");
        int principle = sc.nextInt();
        System.out.print("Enter the Rate of Interest (%): ");
        int rate = sc.nextInt();
        System.out.print("Enter the Time (yrs): ");
        int time = sc.nextInt();

        sc.close();

        int si = calculator(principle, rate, time);

        System.out.println("The Simple Interest is " + si + " for Principal " + principle + ", Rate of Interest " + rate
                + " and Time " + time);

    }
}