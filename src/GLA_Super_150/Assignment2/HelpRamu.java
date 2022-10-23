package GLA_Super_150.Assignment2;

import java.util.Scanner;

public class HelpRamu {
    public static int help(int[] a, int[] b, int c1, int c2, int c3, int c4, int n, int m) {
        int cost2 = 0, cost3 = 0, cost4;
        for (int i = 0; i < a.length; i++) {
            cost2 += (Math.min(a[i] * c1, c2));
        }

        cost3 = Math.min(cost2, c3);
        cost2 = 0;
        for (int i = 0; i < b.length; i++) {
            cost2 += (Math.min(b[i] * c1, c2));
        }

        cost3 += Math.min(cost2, c3);
        cost4 = Math.min(cost3, c4);
        return cost4;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// taking the input from the user
        int t = sc.nextInt();// no of test cases
        while (t-- > 0) {
            int c1 = sc.nextInt();// cost of one ride on some rickshaw or cab
            int c2 = sc.nextInt();//cost of an unlimited number of rides on some rickshaw or on some cab.
            int c3 = sc.nextInt();// cost of  unlimited number of rides on all rickshaws or all cabs
            int c4 = sc.nextInt();//cost of  an unlimited number of rides on all rickshaws and cabs.
            int n = sc.nextInt();// no of riskshaw
            int m = sc.nextInt();// no of cabs
            int[] a = new int[n];// no of times ramu used rikshaw
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int[] b = new int[m];// no of times ramu uses cabs
            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }
            //  System.out.println(minimum(c1+c2+c3+c4));
            System.out.println(help(a, b, c1, c2, c3, c4, n, m));
        }
    }
}
