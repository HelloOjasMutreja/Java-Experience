package level_4_practice_problems;

import java.util.Scanner;

class pp15 {
    public static void main(String[] args) {
        int n, factorial = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a natural number (1, 2, 3...)");
        n = sc.nextInt();

        if (n >= 0) {
            for (int i = n; i > 0; i--) {
                factorial *= i;
            }
            System.out.println("The factorial of " + n + " is " + factorial);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }

        sc.close();
    }
}
