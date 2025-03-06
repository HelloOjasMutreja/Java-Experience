package level_2_practice_programs;

import java.util.Scanner;

class pp5 {
    public static void main(String[] args) {
        float unitPrice, quantity, totalPrice;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the unit price: ");
        unitPrice = input.nextFloat();
        System.out.println("Enter the quantity: ");
        quantity = input.nextFloat();
        totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity
                + " and unit price is INR " + unitPrice);
        input.close();
    }
}
