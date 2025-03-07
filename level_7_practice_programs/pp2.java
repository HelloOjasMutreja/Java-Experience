package level_7_practice_programs;

import java.util.Scanner;

class pp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the number " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        for (int x = 0; x < 5; x++) {
            if (arr[x] > 0) {
                if (arr[x] % 2 == 0) {
                    System.out.println("The number " + arr[x] + " is positive and is even.");
                } else {
                    System.out.println("The number " + arr[x] + " is positive and is odd.");
                }
            } else if (arr[x] == 0) {
                System.out.println("The number " + arr[x] + " is zero.");
            } else {
                System.out.println("The number " + arr[x] + " is negative.");
            }
        }

        if (arr[0] > arr[4]) {
            System.out.println("The first number " + arr[0] + " is greater than the last number " + arr[4]);
        } else if (arr[0] == arr[4]) {
            System.out.println("The first number and the last number is equal to " + arr[4]);
        } else {
            System.out.println("The first number " + arr[0] + " is lesser than the last number " + arr[4]);
        }

        sc.close();
    }
}
