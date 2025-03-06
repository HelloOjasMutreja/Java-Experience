package level_5_practice_programs;

import java.util.Scanner;

class pp1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        n = sc.nextInt();

        System.out.println("\nThe even numbers: ");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("\nThe odd numbers: \n");
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
