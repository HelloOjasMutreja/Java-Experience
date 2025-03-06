package level_2_practice_programs;

import java.util.Scanner;

class pp1 {
    public static void main(String[] args) {
        float num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        num1 = input.nextFloat();
        System.out.println("Enter the second number:");
        num2 = input.nextFloat();
        float add = num1 + num2;
        float sub = num1 - num2;
        float mult = num1 * num2;
        float div = num1 / num2;

        System.out
                .println("The addition, subtraction, multiplication and division value of 2 numbers 1" + num1 + " and "
                        + num2 + " is " + add + ", " + sub + ", " + mult + ", and " + div);
        input.close();
    }

}
