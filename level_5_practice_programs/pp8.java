package level_5_practice_programs;

import java.util.Scanner;

class pp8 {
    public static void main(String[] args) {
        int n, greatestFactor = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();

        for (int i = 1; i <= n - 1; i++) {
            if (n % i == 0) {
                greatestFactor = i;
            }
        }

        System.out.println("The greatest factor is: " + greatestFactor);
        sc.close();
    }
}
