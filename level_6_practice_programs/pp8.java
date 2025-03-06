package level_6_practice_programs;

import java.util.Scanner;

class pp8 {
    public static void main(String[] args) {
        int n, i, sum = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        sc.close();

        i = n;
        while (i % 10 != 0) {
            sum += i % 10;
            i /= 10;
        }

        if (n % sum == 0) {
            System.out.println("The number " + n + " is a Harshad Number");
        } else {
            System.out.println("The number " + n + " is not a Harshad Number");
        }
    }
}
