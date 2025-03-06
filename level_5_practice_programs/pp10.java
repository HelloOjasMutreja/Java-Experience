package level_5_practice_programs;

import java.util.Scanner;

class pp10 {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number (1 - 100): ");
        n = sc.nextInt();

        for (int i = 100; i >= 1; i--) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

        System.out.println("The multiples are: ");
        sc.close();
    }
}
