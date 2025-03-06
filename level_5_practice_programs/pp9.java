package level_5_practice_programs;

import java.util.Scanner;

class pp9 {
    public static void main(String[] args) {
        int n, p, result = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();

        System.out.println("Enter the power: ");
        p = sc.nextInt();

        for (int i = 1; i <= p; i++) {
            result *= n;
        }

        System.out.println("The power is: " + result);
        sc.close();
    }
}
