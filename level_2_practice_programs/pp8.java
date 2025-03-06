package level_2_practice_programs;

import java.util.Scanner;

class DoubleOperation {
    public static void main(String[] args) {
        double a, b, c, sum, sub, mult;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers (press ENTER after each integer): ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        sum = a + b + c;
        sub = a - (b + c);
        mult = a * b * c;

        System.out.println("The results of Double Operations are \nAddition (a + b + c): " + sum
                + ",\nSubtraction (a - (b + c)): " + sub + ", and\nMultiplication (a * b * c): " + mult);
        input.close();
    }
}
