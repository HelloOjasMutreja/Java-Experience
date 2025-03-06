package level_5_practice_programs;

import java.util.Scanner;

class FizzBuzz1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.print(i);
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.print(" Fizz\n");
            } else if (i % 3 != 0 && i % 5 == 0) {
                System.out.print(" Buzz\n");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(" Fizz Buzz\n");
            } else {
                System.out.print("\n");
            }
        }
        sc.close();
    }
}
