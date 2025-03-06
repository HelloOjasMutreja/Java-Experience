package level_5_practice_programs;

import java.util.Scanner;

class pp2 {
    public static void main(String[] args) {
        int salary, bonus, years;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        salary = sc.nextInt();

        System.out.println("Enter your years spent in the company: ");
        years = sc.nextInt();

        if (years > 5) {
            bonus = salary * 5 / 100;
        } else {
            bonus = 0;
        }

        System.out.println("Your bonus: " + bonus);

        sc.close();

    }
}
