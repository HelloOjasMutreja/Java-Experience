package level_2_practice_programs;

import java.util.Scanner;

class pp6 {
    public static void main(String[] args) {
        float num1, num2, quotient, remainder;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        num1 = input.nextFloat();
        System.out.println("Enter the second number: ");
        num2 = input.nextFloat();
        quotient = num1 / num2;
        remainder = num1 % num2;

        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + num1
                + " and " + num2);
        input.close();
    }
}
