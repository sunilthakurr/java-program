package GLA_Super_150.Assignment2;

import java.util.Scanner;

public class SortingInLinearTime {
    public static void main(String[] args) {
        // Your Code Here
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int[] arr = new int[N];
        int zeroN = 0;
        int oneN = 0;
        int twoN = 0;
        for (int i = 0; i < N; ++i) {
            arr[i] = obj.nextInt();
            if (arr[i] == 0)
                zeroN++;
            else if (arr[i] == 1)
                oneN++;
            else
                twoN++;
        }
        for (int i = 0; i < N; ++i) {
            if (zeroN != 0) {
                arr[i] = 0;
                --zeroN;
            } else if (oneN != 0) {
                arr[i] = 1;
                --oneN;
            } else {
                arr[i] = 2;
                --twoN;
            }
        }
        for (int i = 0; i < N; ++i) {
            System.out.println(arr[i]);
        }
    }
}
