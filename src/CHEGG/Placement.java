package CHEGG;

import java.util.Scanner;

public class Placement {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int ele = obj.nextInt();
        int count = 0;
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = obj.nextInt();
            if (arr[i] != ele)
                ++count;
        }
        System.out.println(count);
    }
}
