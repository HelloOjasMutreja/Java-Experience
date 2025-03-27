package level_9_practice_programs;

import java.util.Scanner;

public class pp8 {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int[] find = new int[2];

        if (number1 >= number2) {
            if (number1 >= number3) {
                find[0] = number1;
            } else {
                find[0] = number3;
            }

            if (number2 <= number3) {
                find[1] = number2;
            } else {
                find[1] = number3;
            }

        } else {
            if (number2 >= number3) {
                find[0] = number2;
            } else {
                find[0] = number3;
            }

            if (number1 <= number3) {
                find[1] = number1;
            } else {
                find[1] = number3;
            }
        }

        return find;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers (Press ENTER after each entry): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        int[] x = findSmallestAndLargest(a, b, c);

        System.out.println("The largest of the three is " + x[0] + " and the smallest is " + x[1]);
    }
}
