package level_5_practice_programs;

import java.util.Scanner;

class FizzBuzz2 {
    public static void main(String[] args) {
        int n, i;

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        i = n;

        while (i != 0) {
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

            i--;
        }
        sc.close();
    }
}
