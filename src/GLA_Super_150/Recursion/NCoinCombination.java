package GLA_Super_150.Recursion;

import java.util.Scanner;

public class NCoinCombination {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of coins");
        int N = obj.nextInt();
        CoinCombinationWithout(N, "");
        System.out.println();
        CoinCombination(N, "");


    }

    // method to display all the possibilities without concurrent heads
    public static void CoinCombinationWithout(int N, String helper) {

        if (N == 0) {
            if (!helper.contains("HH"))
                System.out.print(helper + " ");
            return;
        }

        CoinCombinationWithout(N - 1, helper + "H");
        CoinCombinationWithout(N - 1, helper + "T");
    }

    // displaying all the coin possibilities
    public static void CoinCombination(int N, String helper) {
        if (N == 0) {
            System.out.print(helper + " ");
            return;
        }
        CoinCombination(N - 1, helper + "H");
        CoinCombination(N - 1, helper + "T");
    }
}
