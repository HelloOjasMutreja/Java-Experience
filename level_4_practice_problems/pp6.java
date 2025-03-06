package level_4_practice_problems;

import java.util.Scanner;

class pp6 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        a = sc.nextInt();

        if (a > 0) {
            System.out.println("positive");
        } else if (a < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
        sc.close();
    }
}
