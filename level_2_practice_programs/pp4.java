package level_2_practice_programs;

import java.util.Scanner;

class pp4 {
    public static void main(String[] args) {
        float distanceInFeet, distanceInMiles, distanceInYards;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the distance in feet: ");
        distanceInFeet = input.nextFloat();
        distanceInYards = distanceInFeet / 3;
        distanceInMiles = distanceInYards / 1760;
        System.out.println("The distance in feet is " + distanceInFeet + " while in miles is " + distanceInMiles
                + " and in yards is " + distanceInYards);
        input.close();
    }
}
