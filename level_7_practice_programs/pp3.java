package level_7_practice_programs;

import java.util.Scanner;

class pp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int[] table = new int[10];

        for (int i = 0; i < 10; i++) {
            table[i] = n * (i + 1);
        }

        for (int x = 1; x <= 10; x++) {
            System.out.println(n + " * " + x + " = " + table[x - 1]);
        }

        sc.close();
    }
}
