package level_6_practice_programs;

import java.util.Scanner;

class pp4 {
    public static void main(String[] args) {
        int n, isPrime, i = 2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        sc.close();

        while (i < n) {
            if (n % i == 0) {
                System.out.println(n + " is not a Prime Number");
                return;
            }
            i++;
        }

        isPrime = n;
        System.out.println(isPrime + " is a Prime Number");
    }
}
