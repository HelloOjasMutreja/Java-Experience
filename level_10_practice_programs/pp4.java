package level_10_practice_programs;

class UnitConverter1 {

    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double m) {
        return m * 3.28084;
    }

    public static double convertFeetToMeters(double ft) {
        return ft * 0.3048;
    }

    public static void main(String[] args) {
        System.out.println("5 km to miles: " + convertKmToMiles(5));
        System.out.println("3 miles to km: " + convertMilesToKm(3));
        System.out.println("10 meters to feet: " + convertMetersToFeet(10));
        System.out.println("32 feet to meters: " + convertFeetToMeters(32));
    }
}
