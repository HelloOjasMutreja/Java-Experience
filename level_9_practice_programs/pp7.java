package level_9_practice_programs;

import java.util.Scanner;

public class pp7 {
    public static int looping(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        sc.close();

        System.out.println("The sum of first " + x + " natural numbers is " + looping(x));
    }
}
