package level_3_practice_programs;

import java.util.Scanner;

class TemperatureConverter1 {
    public static void main(String[] args) {

        float c, f;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in celsius: ");
        c = input.nextFloat();
        f = (c * 9 / 5) + 32;
        System.out.println("The " + c + " celsius is " + f + " fahrenheit");
        input.close();
    }
}
