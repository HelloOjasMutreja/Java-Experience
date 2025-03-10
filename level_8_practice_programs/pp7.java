package level_8_practice_programs;

import java.util.Scanner;

class pp7 {
    public static void main(String[] args) {
        float w, h, bmi;
        Scanner sc = new Scanner(System.in);
        float[][] array = new float[2][3];
        String[] status = new String[2];

        for (int i = 0; i < 2; i++) {

            System.out.println("Person " + (i + 1) + " details:");
            System.out.print("Enter the weight (Kg): ");
            w = sc.nextFloat();
            System.out.print("Enter the height (cm): ");
            h = sc.nextFloat();

            h /= 100;

            bmi = w / (h * h);

            array[i][0] = w;
            array[i][1] = h;
            array[i][2] = bmi;

            if (bmi >= 40) {
                status[i] = "Obese";
            } else if (bmi >= 25) {
                status[i] = "Overweight";
            } else if (bmi >= 18.5) {
                status[i] = "Normal";
            } else {
                status[i] = "Underweight";
            }
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("\nPerson " + (i + 1) + " details:");
            System.out.println("Height: " + array[i][1] + "\nWeight: " + array[i][0] + "\nBMI: " + array[i][2]
                    + "\nStatus: " + status[i]);
        }

        sc.close();
    }
}
