package level_2_practice_programs;

import java.util.Scanner;

class IntOperation {
    public static void main(String[] args) {
        int a, b, c, sum, sub, mult;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers (press ENTER after each integer): ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        sum = a + b + c;
        sub = a - (b + c);
        mult = a * b * c;

        System.out.println("The results of Int Operations are \nAddition (a + b + c): " + sum
                + ",\nSubtraction (a - (b + c)): " + sub + ", and\nMultiplication (a * b * c): " + mult);
        input.close();
    }
}
