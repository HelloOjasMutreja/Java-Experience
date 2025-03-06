package level_6_practice_programs;

import java.util.Scanner;

class pp6 {
    public static void main(String[] args) {
        int n, count;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        sc.close();

        count = (int) (Math.log10(n) + 1);
        System.out.println("The digits in " + n + " are " + count);
    }
}
