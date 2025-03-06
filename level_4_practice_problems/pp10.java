package level_4_practice_problems;

import java.util.Scanner;

class pp10 {
    public static void main(String[] args) {
        double sum = 0.0, input;

        Scanner sc = new Scanner(System.in);
        System.out.println("Current sum is " + sum);
        System.out.println("Enter the inputs (Enter 0 to EXIT):");
        input = sc.nextDouble();

        sum = input;
        System.out.println("Current sum is " + sum);

        while (input != 0) {
            input = sc.nextDouble();
            sum += input;
            System.out.println("Current sum is " + sum);
        }
        sc.close();
    }
}
