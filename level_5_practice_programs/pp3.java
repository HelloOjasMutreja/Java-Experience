package level_5_practice_programs;

import java.util.Scanner;

class pp3 {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        n = sc.nextInt();

        for (int i = 6; i <= 9; i++) {
            int x = n * i;
            System.out.println(n + " times " + i + " = " + x);
        }

        sc.close();
    }
}
