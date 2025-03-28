package level_9_practice_programs;

import java.util.Scanner;

public class pp11 {
    public static double calculateWindChill(double temperature, double windSpeed) {
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        double t = sc.nextInt();
        System.out.print("Enter the Wind Speed: ");
        double s = sc.nextInt();
        sc.close();

        double result = calculateWindChill(t, s);
        System.out.println("The Wind Chill is " + result);
    }
}
