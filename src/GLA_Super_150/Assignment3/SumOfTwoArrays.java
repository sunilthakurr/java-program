package GLA_Super_150.Assignment3;

import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int[] arr1 = new int[N];
        for (int i = 0; i < N; ++i) {
            arr1[i] = obj.nextInt();
        }
        int M = obj.nextInt();
        int[] arr2 = new int[M];
        for (int i = 0; i < M; ++i) {
            arr2[i] = obj.nextInt();
        }
        //     ArrayList<Integer> list = new ArrayList<>();
        //     int min = Math.min(N, M);
        //     int i = 0;
        //     while(i < min){
        //         int sum = arr1[i] + arr2[i];
        //         int carray = sum / 10;
        //         sum %= 10;
        //         list.add(sum);
        //         ++i;

        //     }
        //     for(int j = list.size() - 1; j >= 0; --j){
        //         System.out.print(list.get(j)+" ");
        //     }
        int num = calSum(arr1, arr2, N, M);
        // System.out.println(num);
        int len = (int) Math.log10(num) + 1;
        int[] arr = new int[len];
        for (int i = 0; i < len; ++i) {
            arr[i] = num % 10;
            num /= 10;
        }
        for (int i = len - 1; i >= 0; --i) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("END");
    }

    static int calSumUtil(int a[], int b[],
                          int n, int m) {
        // array to store sum.
        int[] sum = new int[n];

        int i = n - 1, j = m - 1, k = n - 1;

        int carry = 0, s = 0;

        // Until we reach beginning of array.
        // we are comparing only for second
        // array because we have already compare
        // the size of array in wrapper function.
        while (j >= 0) {
            // find sum of corresponding element
            // of both array.
            s = a[i] + b[j] + carry;

            sum[k] = (s % 10);

            // Finding carry for next sum.
            carry = s / 10;

            k--;
            i--;
            j--;
        }

        // If second array size is less
        // the first array size.
        while (i >= 0) {
            // Add carry to first array elements.
            s = a[i] + carry;
            sum[k] = (s % 10);
            carry = s / 10;

            i--;
            k--;
        }

        int ans = 0;

        // If there is carry on adding 0 index
        // elements  append 1 to total sum.
        if (carry == 1)
            ans = 10;

        // Converting array into number.
        for (i = 0; i <= n - 1; i++) {
            ans += sum[i];
            ans *= 10;
        }

        return ans / 10;
    }

    // Wrapper Function
    static int calSum(int a[], int b[], int n,
                      int m) {
        // Making first array which have
        // greater number of element
        if (n >= m)
            return calSumUtil(a, b, n, m);

        else
            return calSumUtil(b, a, m, n);
    }
}