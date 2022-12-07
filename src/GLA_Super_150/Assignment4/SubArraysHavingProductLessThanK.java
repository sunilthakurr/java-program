package GLA_Super_150.Assignment4;

import java.util.Scanner;

public class SubArraysHavingProductLessThanK {
    static int countsubarray(int array[], int N, int k) {
        int count = 0;
        int i, j, mul;
        for (i = 0; i < N; i++) {
            if (array[i] < k)
                count++;

            mul = array[i];
            for (j = i + 1; j < N; j++) {
                mul = mul * array[j];
                if (mul < k)
                    count++;
                else
                    break;
            }
        }

        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }

        int count = countsubarray(array, N, k);
        System.out.print(count);
    }
}
