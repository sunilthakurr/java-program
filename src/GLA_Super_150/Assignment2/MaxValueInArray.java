package GLA_Super_150.Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class MaxValueInArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = obj.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[N - 1]);

    }
}
