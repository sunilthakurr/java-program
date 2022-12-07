package GLA_Super_150.Assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class PeranceParty {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = obj.nextInt();
        }
        int sum = 0;
        Arrays.sort(arr);
        for (int i = 0; i < N; ++i) {
            if (i % 2 == 0)
                sum += arr[i];
        }
        System.out.println(sum);
    }
}
