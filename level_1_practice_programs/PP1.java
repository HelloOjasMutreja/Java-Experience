package level_1_practice_programs;

class AgeCalc {
    public static void main(String[] args) {
        // Declaring the name as Harry
        String name = "Harry";

        // Declaring brith year as 2000
        int birthYear = 2000;

        // Declaring the current year as 2024
        int currentYear = 2024;

        // Calculating age
        int age = currentYear - birthYear;

        // Displaying teh output
        System.out.println(name + "'s age in " + currentYear + " is " + age);
    }
}