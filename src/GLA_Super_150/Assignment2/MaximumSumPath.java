package GLA_Super_150.Assignment2;

//import java.util.ArrayList;

import java.util.Scanner;

public class MaximumSumPath {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);// taking the imput from the user
        int t = sc.nextInt();
        while (t-- != 0)// checking the test case condition
        {
            int n = sc.nextInt();// size of first array
            int m = sc.nextInt();// size of second array

            int[] arr;// taking the first array input
            arr = new int[n];
            int[] arr2 = new int[m];//taking the second array input

            for (int i = 0; i < n; i++)// traversing the first arrty
                arr[i] = sc.nextInt();
            for (int i = 0; i < m; i++)// traversing the second array
            {
                arr2[i] = sc.nextInt();
            }

            int sum1 = 0;// initializing the sum1 as zero for first array
            int sum2 = 0;// initializing the sum2 as zero for second array
            int ans = 0;
            int i = 0, j = 0;
            while (i < n && j < m) {
                if (arr[i] < arr2[j])
                    sum1 += arr[i++];

                else if (arr[i] > arr2[j])
                    sum2 += arr2[j++];
                    // checking the conditon for common point finding
                else {
                    ans += Math.max(sum1, sum2) + arr[i];
                    sum1 = 0;
                    sum2 = 0;

                    i++;  //incerement after adding common point.
                    j++;
                }
            }
            // left element if array if size is different.
            while (i < n)
                sum1 += arr[i++];
            while (j < m)
                sum2 += arr2[j++];

            ans += Math.max(sum1, sum2);

            System.out.println(ans);
        }
    }
}
