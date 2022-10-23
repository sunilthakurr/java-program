package GLA_Super_150.Assignment2;

import java.util.Scanner;

public class CalculateTheSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//taking the imput from the user
        int n = sc.nextInt();
        long[] arr = new long[n];// makaing the first array
        long[] answer = new long[n];//making the second array
        for (int i = 0; i < arr.length; i++) {// teaversing the array
            arr[i] = sc.nextLong();
        }
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        long q = sc.nextLong();
        while (q-- > 0) {
            int k = sc.nextInt();
            int pos = 0;
            for (int i = 0; i < arr.length; i++) {
                pos = (arr.length + i - k) % arr.length;
                answer[i] += arr[pos];
            }
            for (int i = 0; i < arr.length; i++) {
                arr[i] = answer[i];
            }
        }
        long sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
        }
        System.out.println((long) (sum1 % (Math.pow(10, 9) + 7)));
    }
}
