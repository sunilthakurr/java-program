package GLA_Super_150.Assignment2;

import java.util.Scanner;

public class NextPermutation {

    public static void reverserange(int[] arr, int si, int ei) {// created a function

        while (si <= ei) {// checking the condition
            int temp = arr[si];//storing the arry value in the third variable
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }

    public static void nextPermutation(int[] arr) {
        int p = 0;
        int q = 0;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                p = i;
                break;
            }
        }
        for (int i = arr.length - 1; i > p; i--) {
            if (arr[i] > arr[p]) {
                q = i;
                break;
            }
        }
        if (p == 0 && q == 0) {
            reverserange(arr, 0, arr.length - 1);
            return;
        }
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;
        reverserange(arr, p + 1, arr.length - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            nextPermutation(arr);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
