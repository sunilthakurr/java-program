package GLA_Super_150.Assignment2;


import java.util.Scanner;

public class InverseOfAnArray {
    public static void main(String[] args) {
        // Your Code Here
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int[] arr = new int[N];
        int[] arr2 = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = obj.nextInt();
            arr2[arr[i]] = i;
        }
        for (int i = 0; i < N; ++i) {
            System.out.print(arr2[i] + " ");
        }
    }
}

