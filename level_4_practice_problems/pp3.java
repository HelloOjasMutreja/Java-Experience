package level_4_practice_problems;

import java.util.Scanner;

class pp3 {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers (Press ENTER after each entry): ");

        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("The largest number is: " + n1);
            } else {
                System.out.println("The largest number is: " + n3);
            }
        } else {
            if (n2 > n3) {
                System.out.println("The largest number is: " + n2);
            } else {
                System.out.println("The largest number is: " + n3);
            }
        }
        sc.close();

    }
}
