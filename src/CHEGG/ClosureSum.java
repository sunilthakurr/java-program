package CHEGG;

//ex :- 1039  =  19 + 03 = 22
//      123   =  13 + 2  = 15

import java.util.Scanner;

public class ClosureSum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
//        int len = (int)Math.log10(N) + 1;
//        int[] arr = new int[len];
//        int k=0;
//        while(N>0){
//            arr[k]=N%10;
//            N=N/10;
//            k++;
//        }
//        int j = len - 1;
//        for(int i = 0; i < len / 2; ++i){
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            --j;
//        }
//        int sum = 0;
//        int m = len - 1;
//        for(int i = 0; i < len / 2; ++i){
//            int temp = arr[i] * 10 + arr[m];
//            sum += temp;
//            --m;
//        }
//        if(len % 2 != 0){
//            sum += arr[len/2];
//        }
//        System.out.println(sum);
        System.out.println(closureSum(N));

    }

    public static int closureSum(int inputNum) {
        int N = inputNum;
        int len = (int) Math.log10(N) + 1;
        int[] arr = new int[len];
        int k = 0;
        while (N > 0) {
            arr[k] = N % 10;
            N = N / 10;
            k++;
        }
        int j = len - 1;
        for (int i = 0; i < len / 2; ++i) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            --j;
        }
        int sum = 0;
        int m = len - 1;
        for (int i = 0; i < len / 2; ++i) {
            int temp = arr[i] * 10 + arr[m];
            sum += temp;
            --m;
        }
        if (len % 2 != 0) {
            sum += arr[len / 2];
        }
        return sum;
    }
}
