package CHEGG;

import java.util.Arrays;
import java.util.Scanner;

public class KClosestEle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; ++i) {
            arr[i] = obj.nextInt();

        }
        Arrays.sort(arr);
        int k = obj.nextInt();
        int x = obj.nextInt();

    }

    public static int[] closestFinder(int[] arr, int k, int x) {

        return arr;
    }
}
