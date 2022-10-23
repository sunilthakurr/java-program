package GLA_Super_150.Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumTriplets {

    public static void printTriplet(int[] arr, int target) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                if (arr[i] + arr[left] + arr[right] == target) {
                    System.out.println(arr[i] + ", " + arr[left] + " and " + arr[right]);
                    left++;
                    right--;
                } else if (arr[i] + arr[left] + arr[right] < target)
                    left++;
                else
                    right--;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        printTriplet(arr, target);
    }
}
