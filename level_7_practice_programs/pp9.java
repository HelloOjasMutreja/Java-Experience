package level_7_practice_programs;

import java.util.Scanner;

class pp9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows of the matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter the columns of the matrix: ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];
        int[] array = new int[rows * columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter the element A" + (i + 1) + +(j + 1) + ": ");
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int x = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[x] = matrix[i][j];
                x++;
            }
        }

        System.out.print("The elements are: ");
        for (int i = 0; i < x; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
