package level_6_practice_programs;

import java.util.Scanner;

class pp7 {
    public static void main(String[] args) {
        float w, h, bmi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight (Kg): ");
        w = sc.nextFloat();
        System.out.print("Enter the height (cm): ");
        h = sc.nextFloat();

        h /= 100;

        bmi = w / (h * h);

        if (bmi >= 40) {
            System.out.println("Status: Obese");
        } else if (bmi >= 25) {
            System.out.println("Status: Overweight");
        } else if (bmi >= 18.5) {
            System.out.println("Status: Normal");
        } else {
            System.out.println("Status: Underweight");
        }

        sc.close();
    }
}
