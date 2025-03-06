package level_7_practice_programs;

import java.util.Scanner;

class pp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (arr[i] >= 18) {
                System.out.println("Student " + (i + 1) + " with the age " + arr[i] + " can vote");
            } else {
                System.out.println("Student " + (i + 1) + " with the age " + arr[i] + " cannot vote");
            }
        }

        sc.close();
    }
}
