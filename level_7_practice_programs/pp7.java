package level_7_practice_programs;

import java.util.Scanner;

class pp7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        if (n <= 0) {
            System.err.println("Not a natural number.");
            return;
        } else {
            int s = n / 2 + 1;
            int[] even = new int[s];
            int[] odd = new int[s];

            for (int i = 0; i < s; i++) {
                even[i] = 0;
                odd[i] = 0;
            }

            int e = 0, o = 0;

            for (int x = 1; x <= n; x++) {
                if (x % 2 == 0) {
                    even[e] = x;
                    e++;
                } else {
                    odd[o] = x;
                    o++;
                }
            }

            System.out.print("The even numbers are: ");
            for (int p = 0; p < s; p++) {
                if (even[p] != 0) {
                    System.out.print(even[p] + " ");
                }
            }

            System.out.print("\nThe odd numbers are: ");
            for (int p = 0; p < s; p++) {
                if (odd[p] != 0) {
                    System.out.print(odd[p] + " ");
                }
            }
        }
    }
}
