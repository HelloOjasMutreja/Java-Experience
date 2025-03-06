package level_3_practice_programs;

import java.util.Scanner;

class TemperatureConverter2 {
    public static void main(String[] args) {

        float c, f;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit: ");
        f = input.nextFloat();
        c = (f - 32) * 5 / 9;
        System.out.println("The " + f + " fahrenheit is " + c + " celsius");
        input.close();
    }
}
