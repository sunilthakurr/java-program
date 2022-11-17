package Arrays;

import java.util.Scanner;

public class SlidingWindows {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; ++i) {
            arr[i] = obj.nextInt();
        }
        int k = obj.nextInt();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; ++i) {
            sum += arr[i];
        }
        if (sum > max)
            max = sum;

        for (int i = k; i < size; ++i) {
            sum += arr[i];
            sum -= arr[i - k];
            if (sum > max)
                max = sum;
        }
        System.out.println(max);
    }
}
