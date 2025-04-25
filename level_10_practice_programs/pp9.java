package level_10_practice_programs;

import java.util.Scanner;

class NumberClassification {

    public static boolean isPositive(int n) {
        return n >= 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b)
            return 1;
        if (a == b)
            return 0;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            if (isPositive(numbers[i])) {
                System.out.println("Positive and " + (isEven(numbers[i]) ? "Even" : "Odd"));
            } else {
                System.out.println("Negative");
            }
        }

        int cmp = compare(numbers[0], numbers[4]);
        if (cmp == 0)
            System.out.println("First and Last are Equal");
        else if (cmp > 0)
            System.out.println("First is Greater");
        else
            System.out.println("Last is Greater");

        sc.close();
    }
}
