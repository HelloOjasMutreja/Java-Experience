package level_3_practice_programs;

import java.util.Scanner;

class IncomeCalc {
    public static void main(String[] args) {
        float s, b, ti;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the salary: ");
        s = input.nextFloat();
        System.out.println("Enter the bonus: ");
        b = input.nextFloat();
        ti = s + b;
        System.out.println(
                "The salary is INR " + s + " and the bonus is INR " + b + ". Hence the Total Income is INR " + ti);
        input.close();

    }

}
