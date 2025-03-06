package level_3_practice_programs;

import java.util.Scanner;

class pp7 {
    public static void main(String[] args) {
        int n, m, perChild, rem;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of chocolates: ");
        n = input.nextInt();

        System.out.println("Enter the number of children: ");
        m = input.nextInt();

        perChild = n / m;
        rem = n % m;

        System.out.println(
                "The number of chocolates each child gets is " + perChild + " and the number of remaining is " + rem);
        input.close();
    }
}
