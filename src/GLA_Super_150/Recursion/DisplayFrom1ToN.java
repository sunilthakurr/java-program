package GLA_Super_150.Recursion;

import java.util.Scanner;

public class DisplayFrom1ToN {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        Display(N);
    }

    public static void Display(int N) {
        if (N < 1)
            return;
        Display(N - 1);
        System.out.println(N);
    }
}
