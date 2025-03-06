package level_4_practice_problems;

import java.util.Scanner;

class pp13 {
    public static void main(String[] args) {
        int n, sum1 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a natural number (1, 2, 3...)");
        n = sc.nextInt();

        if (n > 0) {

            // Using for loop for adding each number
            for (int i = n; i > 0; i--) {
                sum1 += i;
            }

            // Using the formula for sum of n natural numbers
            int sum2 = n * (n + 1) / 2;

            if (sum1 == sum2) {
                System.out.println("The sum of " + n + " natural numbers is " + sum1);
            }

        } else {
            System.out.println("The number " + n + " is not a natural number");
        }

        sc.close();
    }
}
