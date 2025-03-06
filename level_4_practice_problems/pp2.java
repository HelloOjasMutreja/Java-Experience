package level_4_practice_problems;

import java.util.Scanner;

class pp2 {
    public static void main() {
        int n1, n2, n3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers (Press ENTER after each entry): ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        if (n1 < n2 && n1 < n3) {
            System.out.println("Is the first number the smallest?\n" + //
                    "Yes");
        } else {
            System.out.println("Is the first number the smallest?\n" + //
                    "No");
        }

        sc.close();

    }
}
