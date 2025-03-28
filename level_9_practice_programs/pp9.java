package level_9_practice_programs;

import java.util.Scanner;

public class pp9 {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] answer = new int[2];
        answer[0] = number / divisor;
        answer[1] = number % divisor;
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int d = sc.nextInt();
        sc.close();

        int[] result = findRemainderAndQuotient(n, d);

        System.out.println("The quotient is " + result[0] + " and the remainder is " + result[1]);
    }
}
