package level_3_practice_programs;

import java.util.Scanner;

class pp10 {
    public static void main(String[] args) {
        double kg, oz;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight in pounds: ");
        oz = sc.nextDouble();

        kg = oz / 2.2;

        System.out.println("The weight of the person in pound is " + oz + " and in kg is " + kg);
        sc.close();
    }
}
