package level_8_practice_programs;

import java.util.*;

class pp10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int i = n;
        int x = (int) (Math.log10(n) + 1);

        int[] arr = new int[x];

        for (int m = 0; m < x; m++) {
            arr[x - m - 1] = i % 10;
            i /= 10;
        }

        Arrays.sort(arr);

        int f = 1;

        for (int j = 1; j < x; j++) {
            if (arr[j] == arr[j - 1]) {
                f++;
            } else {
                System.out.println("The number " + arr[j - 1] + " has frequency of " + f);
                f = 1;
            }
        }
        System.out.println("The number " + arr[x - 1] + " has frequency of " + f);

        sc.close();
    }
}
