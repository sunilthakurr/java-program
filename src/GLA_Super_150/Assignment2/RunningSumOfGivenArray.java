package GLA_Super_150.Assignment2;

import java.util.Scanner;

public class RunningSumOfGivenArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int[] arr = new int[N];
        int sum = 0;
        for (int i = 0; i < N; ++i) {
            arr[i] = obj.nextInt();
            sum += arr[i];
            System.out.print(sum + " ");
        }


    }
}
