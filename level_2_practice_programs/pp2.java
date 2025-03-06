package level_2_practice_programs;

import java.util.Scanner;

class pp2 {
    public static void main(String[] args) {
        float base, height;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of the triangle: ");
        base = input.nextFloat();
        System.out.println("Enter the height of the triangle: ");
        height = input.nextFloat();

        double areaCms = 0.5 * base * height;
        double areaInches = 0.5 * (base * height) / (2.54 * 2.54);
        System.out.println("The area of the triangle in square centimeters is " + areaCms
                + " while in square inches is " + areaInches);
        input.close();
    }
}
