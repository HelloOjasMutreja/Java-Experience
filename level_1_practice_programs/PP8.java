package level_1_practice_programs;

import java.util.Scanner;

class KmsToMiles {
    public static void main(String[] args) {
        double km;
        Scanner input = new Scanner(System.in);

        km = input.nextInt();
        double mile = km * 1.6;
        System.out.println("The total miles is " + mile + " mile for the given " + km + "km");
        input.close();
    }
}
