package level_10_practice_programs;

class UnitConverter2 {

    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double ft) {
        return ft * 0.333333;
    }

    public static double convertMetersToInches(double m) {
        return m * 39.3701;
    }

    public static double convertInchesToMeters(double in) {
        return in * 0.0254;
    }

    public static double convertInchesToCm(double in) {
        return in * 2.54;
    }

    public static void main(String[] args) {
        System.out.println("2 yards to feet: " + convertYardsToFeet(2));
        System.out.println("6 feet to yards: " + convertFeetToYards(6));
        System.out.println("1 meter to inches: " + convertMetersToInches(1));
        System.out.println("40 inches to meters: " + convertInchesToMeters(40));
        System.out.println("10 inches to cm: " + convertInchesToCm(10));
    }
}
