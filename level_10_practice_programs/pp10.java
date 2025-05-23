package level_10_practice_programs;

import java.util.Scanner;

class BMICalculator {

    public static double calculateBMI(double weight, double height) {
        height = height / 100; // convert cm to m
        return weight / (height * height);
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        String[] status = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm): ");
            data[i][1] = sc.nextDouble();
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
            status[i] = getStatus(data[i][2]);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + " - Weight: " + data[i][0] + "kg, Height: " + data[i][1]
                    + "cm, BMI: " + data[i][2] + ", Status: " + status[i]);
        }

        sc.close();
    }
}