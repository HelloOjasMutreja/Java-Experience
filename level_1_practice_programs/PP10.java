package level_1_practice_programs;

import java.util.Scanner;

class CmstoInchesConverterAdvanced {
    public static void main(String[] args) {
        double height;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the height in cms: ");
        height = input.nextDouble();

        double newHeight = height / 2.54;
        double feet = (int) newHeight / 12;
        double inches = (int) newHeight % 12;
        System.out.println(
                "Your Height in cm is " + height + " while in feet is " + feet + " and inches is " + inches);

        input.close();
    }
}