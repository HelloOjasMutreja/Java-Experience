package level_6_practice_programs;

import java.util.Scanner;

class pp9 {
    public static void main(String[] args) {
        int n, i, sum = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        sc.close();

        i = 1;
        while (i < n) {
            if (n % i == 0) {
                sum += i;
            }
            i++;
        }

        if (sum > n) {
            System.out.println("The number " + n + " is an Abundant Number");
        } else {
            System.out.println("The number " + n + " is not an Abundant Number");
        }
    }
}
