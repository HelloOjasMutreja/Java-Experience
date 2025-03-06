package level_4_practice_problems;

import java.util.Scanner;

class pp4 {
    public static void main(String[] args) {
        int n, sum;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a natural number (1, 2, 3...)");
        n = sc.nextInt();

        if (n > 0) {
            sum = n * (n + 1) / 2;
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }

        sc.close();
    }
}
