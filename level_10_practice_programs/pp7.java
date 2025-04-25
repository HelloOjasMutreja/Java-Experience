package level_10_practice_programs;

import java.util.Scanner;

class StudentVoteChecker {

    public static boolean canStudentVote(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
            if (ages[i] < 0) {
                System.out.println("Invalid age");
                continue;
            }
            System.out.println(canStudentVote(ages[i]) ? "Can vote" : "Cannot vote");
        }

        sc.close();
    }
}
