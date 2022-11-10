package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySumII {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int[] arr1 = new int[N];
        for (int i = 0; i < N; ++i) {
            arr1[i] = obj.nextInt();

        }
        int M = obj.nextInt();
        int[] arr2 = new int[M];
        for (int i = 0; i < M; ++i) {
            arr2[i] = obj.nextInt();
        }
//        int sum = 0;
//        int j = 0;
//        for(int i  = N - 1; i >= 0; --i){
//            sum += arr1[i] + 10 * j;
//            ++j;
//        }
//        System.out.println(sum);
        int[] arr = new int[N];
        int sum = 0;
        for (int i = N - 1; i >= 0; --i) {
            sum += arr1[i] + arr2[i];
            if (sum <= 9) {
                arr[i] = sum;
                sum = 0;
            } else {
                arr[i] = sum % 10;
                sum = sum / 10;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
