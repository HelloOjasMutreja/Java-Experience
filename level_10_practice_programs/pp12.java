package level_10_practice_programs;

import java.util.Random;

class RandomStats {

    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++)
            arr[i] = 1000 + rand.nextInt(9000);
        return arr;
    }

    public static double[] findAverageMinMax(int[] arr) {
        int sum = 0, min = arr[0], max = arr[0];
        for (int n : arr) {
            sum += n;
            if (n < min)
                min = n;
            if (n > max)
                max = n;
        }
        return new double[] { sum / (double) arr.length, min, max };
    }

    public static void main(String[] args) {
        int[] randoms = generate4DigitRandomArray(5);
        System.out.print("Random Numbers: ");
        for (int r : randoms)
            System.out.print(r + " ");
        System.out.println();

        double[] stats = findAverageMinMax(randoms);
        System.out.println("Average: " + stats[0]);
        System.out.println("Min: " + stats[1]);
        System.out.println("Max: " + stats[2]);
    }
}
