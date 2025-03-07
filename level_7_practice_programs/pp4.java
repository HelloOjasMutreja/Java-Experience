package level_7_practice_programs;

import java.util.Scanner;

class pp4 {
    public static void main(String[] args) {
        double sum = 0;
        double[] arr = new double[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            arr[i] = 0.0;
        }

        System.out.println("Enter the numbers below:");
        System.out.println("(Press ENTER after each entry)");
        System.out.println("(Enter 0 to stop)");

        for (int x = 0; x < 10; x++) {
            arr[x] = sc.nextDouble();

            if (arr[x] == 0) {

                break;
            }

            sum += arr[x];
        }

        System.err.println("The sum is " + sum);

        sc.close();
    }
}
