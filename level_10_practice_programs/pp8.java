package level_10_practice_programs;

import java.util.Scanner;

class FriendsInfo {

    public static int findYoungest(int[] age) {
        int min = 0;
        for (int i = 1; i < age.length; i++) {
            if (age[i] < age[min])
                min = i;
        }
        return min;
    }

    public static int findTallest(double[] height) {
        int max = 0;
        for (int i = 1; i < height.length; i++) {
            if (height[i] > height[max])
                max = i;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = { "Amar", "Akbar", "Anthony" };
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + " in cm: ");
            heights[i] = sc.nextDouble();
        }

        int youngest = findYoungest(ages);
        int tallest = findTallest(heights);

        System.out.println("Youngest: " + names[youngest]);
        System.out.println("Tallest: " + names[tallest]);
        sc.close();
    }
}
