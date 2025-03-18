package level_9_practice_programs;

import java.util.Scanner;

public class pp4 {
    public static int roundCalculator(int t) {
        int x = 5000 / t;
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side 1: ");
        int a = sc.nextInt();
        System.out.print("Enter the side 2: ");
        int b = sc.nextInt();
        System.out.print("Enter the side 3: ");
        int c = sc.nextInt();
        sc.close();

        int n = a + b + c;

        System.out.println("The number of rounds the athlete would run is " + roundCalculator(n));
    }
}
