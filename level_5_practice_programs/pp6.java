package level_5_practice_programs;

import java.util.Scanner;

class pp6 {
    public static void main(String[] args) {
        int amarA, akbarA, anthonyA;
        double amarH, akbarH, anthonyH;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Amar's Age: ");
        amarA = sc.nextInt();

        System.out.println("Enter Akbar's Age: ");
        akbarA = sc.nextInt();

        System.out.println("Enter Anthony's Age: ");
        anthonyA = sc.nextInt();

        System.out.println("Enter Amar's Height: ");
        amarH = sc.nextDouble();

        System.out.println("Enter Akbar's Height: ");
        akbarH = sc.nextDouble();

        System.out.println("Enter Anthony's Height: ");
        anthonyH = sc.nextDouble();

        if (amarA < akbarA) {
            if (akbarA < anthonyA) {
                System.out.println("Amar is youngest");
            } else {
                System.out.println("Akbar is youngest");
            }
        } else {
            if (amarA < anthonyA) {
                System.out.println("Amar is youngest");
            } else {
                System.out.println("Anthony is youngest");
            }
        }

        if (amarH > akbarH) {
            if (amarH > anthonyH) {
                System.out.println("Amar is tallest");
            } else {
                System.out.println("Anthony is tallest");
            }
        } else {
            if (akbarH > anthonyH) {
                System.out.println("Akbar is tallest");
            } else {
                System.out.println("Anthony is tallest");
            }
        }

        sc.close();
    }
}
