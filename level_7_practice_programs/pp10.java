package level_7_practice_programs;

import java.util.*;

class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        String[] array = new String[n];
        int x = 0;

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    array[x] = "FizzBuzz";
                    x++;
                } else if (i % 3 == 0) {
                    array[x] = "Fizz";
                    x++;
                } else if (i % 5 == 0) {
                    array[x] = "Buzz";
                    x++;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
