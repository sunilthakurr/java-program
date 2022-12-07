package GLA_Super_150.Assignment4;

import java.util.Scanner;
public class NewBieStockTrader {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = obj.nextInt();
        }
        int count = 1, max = 1;
        for (int i = 1; i < N; ++i) {
            if (arr[i] > arr[i - 1]) {
                ++count;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 1;
            }
        }
        if (count > max)
            max = count;
        System.out.println(max);
    }
}
