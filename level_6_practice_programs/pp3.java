package level_6_practice_programs;

import java.util.Scanner;

class pp3 {
    public static void main(String[] args) {
        double sub1, sub2, sub3;
        String grade, remarks;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks in Subject 1 (out of 100): ");
        sub1 = sc.nextDouble();
        System.out.print("Enter the marks in Subject 2 (out of 100): ");
        sub2 = sc.nextDouble();
        System.out.print("Enter the marks in Subject 3 (out of 100): ");
        sub3 = sc.nextDouble();

        double avg = (sub1 + sub2 + sub3) / 3;

        if (avg >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (avg >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (avg >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards)";
        } else if (avg >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards)";
        } else if (avg >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        System.err.println("Grade: " + grade + "\nRemarks: " + remarks + "\nAverage: " + avg);
        sc.close();
    }
}
