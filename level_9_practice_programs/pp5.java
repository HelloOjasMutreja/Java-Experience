package level_9_practice_programs;

import java.util.Scanner;

public class pp5 {
    public static int check(int n) {
        if (n > 0) {
            return 1;
        } else if (n < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        sc.close();

        switch (check(x)) {
            case 1:
                System.out.println("Positive");
                break;

            case -1:
                System.out.println("Negative");
                break;

            case 0:
                System.out.println("Zero");
                break;

            default:
                break;
        }
    }
}
