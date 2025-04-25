package level_10_practice_programs;

import java.util.Scanner;

public class pp1 {

    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        sc.close();

        int[] arr = new int[n];
        int x = 0;
        int sum = 0;
        int sos = 0;
        int prod = 1;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr[x] = i;
                x++;
                sum += i;
                sos += Math.pow(i, 2);
                prod *= i;
            }
        }

        System.out.print("The factors are: ");
        for (int i = 0; i < x; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("The sum of factors are: ");
        System.out.print(sum + "\n");
        System.out.print("The sum of squares of factors are: ");
        System.out.print(sos + "\n");
        System.out.print("The product of factors are: ");
        System.out.print(prod + "\n");
    }
}
