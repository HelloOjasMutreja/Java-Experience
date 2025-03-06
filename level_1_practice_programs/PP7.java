package level_1_practice_programs;

class VolumeComputer {
    public static void main(String[] args) {
        double pi = 3.14;
        double radKms = 6378;
        double radMiles = 6378 * 1.6;

        double volKms = (4 / 3) * pi * radKms * radKms * radKms;
        double volMiles = (4 / 3) * pi * radMiles * radMiles * radMiles;

        System.out.println("The volume of earth in cubic kilometers is " + volKms + " and cubic miles is " + volMiles);
    }

}
