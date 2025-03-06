package level_1_practice_programs;

class DiscountCalc {
    public static void main(String[] args) {
        double fee = 125000;
        double discountPercentage = 10;
        double discountAmount = fee * discountPercentage / 100;
        double finalFee = fee - discountAmount;

        System.out.println(
                "The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);
    }
}
