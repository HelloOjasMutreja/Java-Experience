package level_9_practice_programs;

import java.util.Scanner;

class HandshakeCalc {
    public static int calculator(int n) {
        int h = (n * (n - 1) / 2);
        return h;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of people: ");
        int numberOfStudents = sc.nextInt();
        sc.close();

        int max = calculator(numberOfStudents);
        int min = 0;
        System.out.println(
                "The maximum number of handshakes is: " + max + " and the min is: " + min + " among " + numberOfStudents
                        + " students");
    }
}
