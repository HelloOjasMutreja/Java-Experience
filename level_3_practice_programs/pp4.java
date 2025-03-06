package level_3_practice_programs;

import java.util.Scanner;

class pp4 {
    public static void main(String[] args) {
        float num1, num2, temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number (Press ENTER after each entry): ");
        num1 = input.nextFloat();
        num2 = input.nextFloat();
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("The swapped number are " + num1 + " and " + num2);
        input.close();
    }
}
