package level_4_practice_problems;

import java.util.Scanner;

class pp11 {
    public static void main(String[] args) {
        double sum = 0.0, input;

        Scanner sc = new Scanner(System.in);
        System.out.println("Current sum is " + sum);
        System.out.println("Enter the inputs (Enter 0 to EXIT):");
        input = sc.nextDouble();

        sum = input;
        System.out.println("Current sum is " + sum);

        while (true) {
            input = sc.nextDouble();
            if (input > 0) {
                sum += input;
                System.out.println("Current sum is " + sum);
            } else {
                System.out.println("Exiting with sum " + sum);
                break;
            }
        }

        sc.close();
    }
}
