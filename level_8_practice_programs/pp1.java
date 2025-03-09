package level_8_practice_programs;

import java.util.Scanner;

class pp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] table = new int[10][4];
        int years, salary, bonus, finalSalary;
        // Taking 10 rows and 4 columns for years of service, salary, bonus, and final
        // salary.

        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + " details:");

            // Finding the years of service
            System.out.print("Years of service: ");
            years = sc.nextInt();
            table[i][0] = years;

            // Finding the salary before bonus
            System.out.print("Salary: ");
            salary = sc.nextInt();
            table[i][1] = salary;

            // finding the bonus
            if (years > 5) {
                bonus = salary * 5 / 100;
            } else {
                bonus = salary * 2 / 100;
            }
            table[i][2] = bonus;

            // finding the final salary
            finalSalary = salary + bonus;
            table[i][3] = finalSalary;
        }

        sc.close();

        System.out.println("");

        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + " details:");

            System.out.println("Years of Service: " + table[i][0]);
            System.out.println("Salary: " + table[i][1]);

            // printing the bonus
            System.out.println("Bonus: " + table[i][2]);

            // printing the final salary
            System.out.println("Final Salary: " + table[i][3] + "\n");
        }
    }
}
