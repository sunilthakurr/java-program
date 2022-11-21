package Arrays;

import java.util.Scanner;

public class LongestSubArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();
        for (int i = 0; i < T; ++i) {
            int N = obj.nextInt();
            int[] arr = new int[N];
            for (int j = 0; j < N; ++j) {
                arr[j] = obj.nextInt();
            }
            int max = 0;
            int count = 0;
            for (int j = 0; j < N; ++j) {
                for (int k = j + 1; k < N; ++k) {
                    if (arr[j] == (arr[k] + 1) || arr[j] == arr[k])
                        ++count;
                }
                if (count > max)
                    max = count;
                count = 0;
            }
            System.out.println(max);


        }
    }

}
