package GLA_Super_150.Assignment4;

import java.util.Scanner;

public class LibraryImpasse {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int[] arr = new int[N];
        int sum = 0;
        for (int i = 0; i < N; ++i) {
            arr[i] = obj.nextInt();
            sum += arr[i];
        }
        int sum1 = 0;
        int count = -1;
        for (int i = 0; i < N; ++i) {
            sum1 = Addition(arr, i);
            sum -= arr[i];
            if (sum1 == sum) {
                count = i;
                break;
            }
        }
        System.out.println(count);
    }

    public static int Addition(int[] arr, int ei) {
        int sum = 0;
        for (int i = 0; i < ei; ++i) {
            sum += arr[i];
        }
        return sum;
    }
}
