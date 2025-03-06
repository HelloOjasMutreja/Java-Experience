package level_3_practice_programs;

import java.util.*;

class pp9 {
    public static void main(String[] args) {
        int n, h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        n = sc.nextInt();
        h = (n * (n - 1)) / 2;
        System.out.println("The possible number of handshakes among " + n + " is " + h);
        sc.close();
    }
}
