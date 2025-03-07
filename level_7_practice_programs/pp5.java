package level_7_practice_programs;

import java.util.Scanner;

class pp5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int[] table = new int[4];

        for (int i = 0; i < 4; i++) {
            table[i] = n * (i + 6);
        }

        for (int x = 1; x <= 4; x++) {
            System.out.println(n + " * " + (x + 5) + " = " + table[x - 1]);
        }

        sc.close();
    }
}
