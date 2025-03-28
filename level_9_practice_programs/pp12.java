package level_9_practice_programs;

import java.util.Scanner;

public class pp12 {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radian = angle / 180 * 3.14;
        double[] function = new double[3];
        function[0] = Math.sin(radian);
        function[1] = Math.cos(radian);
        function[2] = Math.tan(radian);
        return function;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the angle: ");
        double a = sc.nextInt();
        sc.close();

        double[] arr = calculateTrigonometricFunctions(a);

        System.out.println(
                "sin(" + a + ") = " + arr[0] + "\ncos(" + a + ") = " + arr[1] + "\ntan(" + a + ") = " + arr[2]);
    }
}
