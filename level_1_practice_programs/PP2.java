package level_1_practice_programs;

class AveragePercentage {
    public static void main(String[] args) {
        // Declaring the name as Sam
        String name = "Sam";

        // Declaring the marks in Maths
        int mat = 94;

        // Declaring the marks in Physics
        int phy = 95;

        // Declaring the marks in Chemistry
        int chem = 96;

        // Calculating the sum
        double sum = mat + phy + chem;

        // Calculating the average percentage
        double avg = (sum / 300) * 100;

        System.out.println(name + "'s average mark in PCM is " + avg);
    }
}
