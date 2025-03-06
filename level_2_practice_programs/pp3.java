package level_2_practice_programs;

import java.util.Scanner;

class pp3 {
    public static void main(String[] args) {
        float side, perimeter;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Perimeter of the square: ");
        perimeter = input.nextFloat();

        side = perimeter / 4;

        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        input.close();
    }
}
