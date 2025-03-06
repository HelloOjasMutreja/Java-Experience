package level_3_practice_programs;

import java.util.Scanner;

class TravelComputation {
    public static void main(String[] args) {
        String name, fromCity, viaCity, toCity;
        float distFromToVia, distViaToFinal, totalDist;
        int timeFromToVia, timeViaToFinal, totalTime;
        Scanner input = new Scanner(System.in);

        // Initializing the variable name by taking in input
        System.out.println("Enter your name: ");
        name = input.next();

        // Initializing the variables fromCity, viaCity, and toCity by taking in input
        System.out.println("Where are you travelling from?");
        fromCity = input.next();

        System.out.println("Travelling Via?");
        viaCity = input.next();

        System.out.println("Travel destination?");
        toCity = input.next();

        // Initializing the distance variables by taking inputs
        System.out.println("How much is the distance from " + fromCity + " to " + viaCity);
        distFromToVia = input.nextFloat();

        System.out.println("And the distance from " + viaCity + " to " + toCity);
        distViaToFinal = input.nextFloat();

        totalDist = distFromToVia + distViaToFinal;

        // Initailazing time variable by taking inputs
        System.out.println("How much time does it take from " + fromCity + " to " + viaCity + " (in minutes)?");
        timeFromToVia = input.nextInt();

        System.out.println("And from " + viaCity + " to " + toCity + " (in minutes)?");
        timeViaToFinal = input.nextInt();

        totalTime = timeFromToVia + timeViaToFinal;

        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via "
                + viaCity + " is " + totalDist + " km and " + "the Total Time taken is " + totalTime + " minutes");

        input.close();
    }

}
