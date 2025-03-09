package level_8_practice_programs;

import java.util.Scanner;

class pp2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] table = new int[3][2];

        System.out.print("Enter the age of Amar: ");
        table[0][0] = sc.nextInt();
        System.out.print("Enter the age of Akbar: ");
        table[1][0] = sc.nextInt();
        System.out.print("Enter the age of Anthony: ");
        table[2][0] = sc.nextInt();

        System.out.print("Enter the height of Amar: ");
        table[0][1] = sc.nextInt();
        System.out.print("Enter the height of Akbar: ");
        table[1][1] = sc.nextInt();
        System.out.print("Enter the height of Anthony: ");
        table[2][1] = sc.nextInt();

        sc.close();

        int minAge = table[0][0];
        int maxHeight = table[0][1];
        int m = 0, n = 0;

        for (int i = 0; i < 3; i++) {
            if (table[i][0] < minAge) {
                minAge = table[i][0];
                m = i;
            }

            if (table[i][1] > maxHeight) {
                maxHeight = table[i][1];
                n = i;
            }
        }

        switch (m) {
            case 0:
                System.out.println("Amar is the youngest with age " + minAge);
                break;
            case 1:
                System.out.println("Akbar is the youngest with age " + minAge);
                break;
            case 2:
                System.out.println("Anthony is the youngest with age " + minAge);
                break;
        }

        switch (n) {
            case 0:
                System.out.println("Amar is the tallest with age " + maxHeight);
                break;
            case 1:
                System.out.println("Akbar is the tallest with age " + maxHeight);
                break;
            case 2:
                System.out.println("Anthony is the tallest with age " + maxHeight);
                break;
        }
    }
}
