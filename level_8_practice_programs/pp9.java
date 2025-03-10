package level_8_practice_programs;

import java.util.Scanner;

class pp9 {
    public static void main(String[] args) {

        double sub1 = -1, sub2 = -1, sub3 = -1;
        double[][] table = new double[10][4];

        String grade, remarks;
        String[][] result = new String[10][2];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter the details of student " + (i + 1) + ": \n");
            while (sub1 < 0) {
                System.out.print("Enter the marks in Subject 1 (out of 100): ");
                sub1 = sc.nextDouble();
            }
            while (sub2 < 0) {
                System.out.print("Enter the marks in Subject 2 (out of 100): ");
                sub2 = sc.nextDouble();
            }
            while (sub3 < 0) {
                System.out.print("Enter the marks in Subject 3 (out of 100): ");
                sub3 = sc.nextDouble();
            }

            double avg = (sub1 + sub2 + sub3) / 3;

            table[i][0] = sub1;
            table[i][1] = sub1;
            table[i][2] = sub3;
            table[i][3] = avg;

            sub1 = -1;
            sub2 = -1;
            sub3 = -1;

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

            result[i][0] = grade;
            result[i][1] = remarks;
        }

        sc.close();

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + " result: \n");
            System.out.print("Subject 1 marks: " + table[i][0] + "\nSubject 2 marks: " + table[i][1]
                    + "\nSubject 3 marks: " + table[i][2] + "\nAverage: " + table[i][3] + "\nGrade: " + result[i][0]
                    + "\nRemarks: " + result[i][1] + "\n");
        }
    }
}
