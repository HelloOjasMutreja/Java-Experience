package level_8_practice_programs;

import java.util.Scanner;

class pp5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        int i = n;
        int x = (int) (Math.log10(n) + 1);

        int[] arr = new int[x];
        int[] revArr = new int[x];

        for (int m = 0; m < x; m++) {
            arr[x - m - 1] = i % 10;
            i /= 10;
        }

        System.out.print("Reversed number: ");
        for (int r = 0; r < x; r++) {
            revArr[r] = arr[x - r - 1];
            System.out.print(revArr[r]);
        }
    }
}
