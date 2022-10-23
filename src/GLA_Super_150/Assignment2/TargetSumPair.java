package GLA_Super_150.Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumPair {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = obj.nextInt();
        }
        int sum = obj.nextInt();
        Arrays.sort(arr);

        for (int i = 0; i < N; ++i) {
            for (int j = i + 1; j < N; ++j) {
                if (arr[i] + arr[j] == sum)
                    System.out.println(arr[i] + " and " + arr[j]);
            }
        }

    }
}
