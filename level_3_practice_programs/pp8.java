package level_3_practice_programs;

import java.util.Scanner;

class pp8 {
    public static void main(String[] args) {
        float p, r, t, si;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principle: ");
        p = input.nextFloat();
        System.out.println("Enter the rate of interest (%): ");
        r = input.nextFloat();
        System.out.println("Enter the time (in years): ");
        t = input.nextFloat();

        si = p * r * t / 100;

        System.out.println(
                "The Simple Interest is " + si + " for Principal " + p + ", Rate of Interest " + r + " and Time " + t);
        input.close();
    }
}
