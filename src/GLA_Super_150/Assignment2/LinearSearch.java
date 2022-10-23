package GLA_Super_150.Assignment2;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        // Your Code Here
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = obj.nextInt();
        }
        int count = 0;
        int target = obj.nextInt();
        for (int i = 0; i < N; ++i) {
            if (arr[i] == target) {
                System.out.println(i);
                count = 1;
                break;
            }
        }
        if (count == 0)
            System.out.println(-1);
    }
}

