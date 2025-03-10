package level_8_practice_programs;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

class pp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        int i = n;
        int x = (int) (Math.log10(n) + 1);

        System.err.println(x);

        int[] arr = new int[x];

        for (int m = 0; m < x; m++) {
            arr[x - m - 1] = i % 10;
            i /= 10;
        }

        System.out.println(Arrays.toString(arr));
    }
}
