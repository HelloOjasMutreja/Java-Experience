package level_6_practice_programs;

import java.util.Scanner;

class pp10 {
    public static void main(String[] args) {
        int n1, n2, result = 0;
        String op;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        n2 = sc.nextInt();
        System.out.print("Enter the operator (+, -, *, /): ");
        op = sc.next();
        sc.close();

        switch (op) {
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                result = n1 / n2;
                break;
        }

        System.out.println("The calculation of " + n1 + " " + op + " " + n2 + " = " + result);
    }
}
