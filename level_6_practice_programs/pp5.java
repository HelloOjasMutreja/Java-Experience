package level_6_practice_programs;

import java.util.Scanner;

class pp5 {
    public static void main(String[] args) {
        int n, i, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        sc.close();

        i = n;
        while (i % 10 != 0) {
            sum += (i % 10) * (i % 10) * (i % 10);
            i /= 10;
        }

        if (sum == n) {
            System.out.println(n + " is an Armstrong number");
        } else {
            System.out.println(n + " is not an Armstrong number");
        }
    }
}
