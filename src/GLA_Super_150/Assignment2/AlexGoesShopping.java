package GLA_Super_150.Assignment2;

import java.util.Scanner;

public class AlexGoesShopping {
    public static boolean check(int[] arr, int a, int b) {
        int c = 0;
        for (int j : arr) {
            if (a % j == 0) {
                c++;
            }
        }
        return c >= b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// length ofarray
        int[] arr = new int[n];// new array
        for (int i = 0; i < n; i++) {// traversing
            arr[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        while (q-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (check(arr, a, b)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
