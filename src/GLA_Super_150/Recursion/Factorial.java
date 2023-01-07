package GLA_Super_150.Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        System.out.println(fact(N, 1));

    }

    public static int fact(int N, int res) {
        if (N <= 1)
            return res;
        res *= (N);
        return fact(N - 1, res);

    }
}

//Tail Recursion :- If we call function in last step i.e; no other line will be last other than function otherwise
//                  it will be head recurssion
