package level_1_practice_programs;

import java.util.Scanner;

class DiscountCalcAdvanced {
    public static void main(String[] args) {
        double fee, discountPercentage;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the fee: ");
        fee = input.nextDouble();

        System.out.println("Enter the discount percentage: ");
        discountPercentage = input.nextDouble();

        double discountAmount = fee * discountPercentage / 100;
        double finalFee = fee - discountAmount;
        System.out.println(
                "The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);

        input.close();
    }
}
