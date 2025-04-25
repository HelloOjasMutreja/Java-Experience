package level_10_practice_programs;

class UnitConverter3 {

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double poundsToKg(double p) {
        return p * 0.453592;
    }

    public static double kgToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double gallonsToLiters(double g) {
        return g * 3.78541;
    }

    public static double litersToGallons(double l) {
        return l * 0.264172;
    }

    public static void main(String[] args) {
        System.out.println("98°F to °C: " + fahrenheitToCelsius(98));
        System.out.println("37°C to °F: " + celsiusToFahrenheit(37));
        System.out.println("10 pounds to kg: " + poundsToKg(10));
        System.out.println("4.5 kg to pounds: " + kgToPounds(4.5));
        System.out.println("5 gallons to liters: " + gallonsToLiters(5));
        System.out.println("10 liters to gallons: " + litersToGallons(10));
    }
}
