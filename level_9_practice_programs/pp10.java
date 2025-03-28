package level_9_practice_programs;

import java.util.Scanner;

public class pp10 {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] answer = new int[2];
        answer[0] = number / divisor;
        answer[1] = number % divisor;
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int numberOfChildren = sc.nextInt();
        sc.close();

        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        System.out.println("Each child gets " + result[0] + " and the remaining is " + result[1] + " chocolates");
    }
}
