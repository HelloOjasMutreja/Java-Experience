package level_4_practice_problems;

import java.util.Scanner;

class pp1 {
    public static void main(String[] args) {
        int num;
        String result;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        num = sc.nextInt();
        if (num % 10 == 5 || num % 10 == 0) {
            result = "Yes";
        } else {
            result = "No";
        }
        System.out.println("Is the number " + num + " divisible by 5? \n" + result);

        sc.close();
    }
}
