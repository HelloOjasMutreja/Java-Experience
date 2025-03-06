package level_4_practice_problems;

import java.util.Scanner;

class pp5 {
    public static void main(String[] args) {
        int age;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age of the user: ");
        age = sc.nextInt();

        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
        sc.close();
    }
}
