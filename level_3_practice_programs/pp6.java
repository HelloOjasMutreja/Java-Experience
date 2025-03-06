package level_3_practice_programs;

import java.util.Scanner;

class pp6 {
    public static void main(String[] args) {
        float s1, s2, s3, peri, rounds;

        Scanner input = new Scanner(System.in);
        System.out.println(
                "Enter the sides S1, S2, and S3 (in meters), for the triangular park (Press ENTER after each entry): ");
        s1 = input.nextFloat();
        s2 = input.nextFloat();
        s3 = input.nextFloat();

        peri = (s1 + s2 + s3) / 1000;
        rounds = 5 / peri;

        System.out.println("The total number of the rounds the athlete will run is " + rounds + " to complete 5 km");
        input.close();
    }
}
