package level_7_practice_programs;

import java.util.Scanner;

class pp8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        int[] factors = new int[2];
        int maxIndex = 2;
        int x = 0;

        for (int i = 1; i < n; i++) {

            if (x == maxIndex) {
                maxIndex *= 2;

                int[] temp = new int[maxIndex];

                System.arraycopy(factors, 0, temp, 0, factors.length);
                factors = temp;
            }

            if (n % i == 0) {
                factors[x] = i;
                x++;
            }
        }

        System.out.print("The factors are: ");
        for (int i = 0; i < x; i++) {
            System.out.print(factors[i] + " ");
        }

    }
}
