package level_1_practice_programs;

class ProfitLossCalc {
    public static void main(String[] args) {

        int costPrice = 129;
        int sellingPrice = 191;
        double profit = sellingPrice - costPrice;
        double profitPercentage = profit / costPrice * 100;

        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\r\n" + //
                "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%");
    }
}
