package GLA_Super_150.Recursion;

import java.util.Scanner;

public class PowerOfNum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        System.out.println(power(a, b));
        System.out.println(PowerOptimised(a, b));

    }

    public static int power(int a, int b) {
        if (b == 0)
            return 1;

        if (a == 0)
            return 0;
        return a * power(a, b - 1);

        // Time-Complexity :- O(N)

    }

    public static int PowerOptimised(int a, int b) {
        // Using divide-and-conuerer approach
        if (b == 0)
            return 1;
        if (a == 0)
            return 0;
        if (b % 2 == 0)
            return PowerOptimised(a * a, b / 2);
        else
            return a * PowerOptimised(a * a, b / 2);

        // Time-Complexity :- O(log(N))
    }
}
