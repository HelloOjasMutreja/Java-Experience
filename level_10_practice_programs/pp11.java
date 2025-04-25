package level_10_practice_programs;

import java.util.Scanner;

class QuadraticRoots {

    public static void findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double r1 = (-b + Math.sqrt(delta)) / (2 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Two Real Roots: " + r1 + ", " + r2);
        } else if (delta == 0) {
            double r = -b / (2 * a);
            System.out.println("One Real Root: " + r);
        } else {
            System.out.println("No Real Roots");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        findRoots(a, b, c);
        sc.close();
    }
}
