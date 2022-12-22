package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class Advantage {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();
        while (T != 0) {
            int N = obj.nextInt();
            int[] arr = new int[N];
            int[] arr2 = new int[N];
            for (int i = 0; i < N; ++i) {
                arr[i] = obj.nextInt();
                arr2[i] = arr[i];
            }
            Arrays.sort(arr2);
            for (int j = 0; j < N; ++j) {
                if (arr[j] == arr2[N - 1])
                    System.out.print(arr[j] - arr2[N - 2] + " ");
                else
                    System.out.print(arr[j] - arr2[N - 1] + " ");
            }
            System.out.println();

            --T;
        }
    }

}
