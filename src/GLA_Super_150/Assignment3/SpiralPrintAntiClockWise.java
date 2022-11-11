package GLA_Super_150.Assignment3;

import java.util.Scanner;

public class SpiralPrintAntiClockWise {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int row = obj.nextInt();
        int col = obj.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                arr[i][j] = obj.nextInt();
            }
        }
        counterClockspiralPrint(row, col, arr);

    }

    static void counterClockspiralPrint(int m,
                                        int n,
                                        int arr[][]) {
        int i, k = 0, l = 0;

    /* k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        i - iterator */

        // initialize the count
        int cnt = 0;

        // total number of
        // elements in matrix
        int total = m * n;

        while (k < m && l < n) {
            if (cnt == total)
                break;

            // Print the first column
            // from the remaining columns
            for (i = k; i < m; ++i) {
                System.out.print(arr[i][l] + ", ");
                cnt++;
            }
            l++;

            if (cnt == total)
                break;

            // Print the last row from
            // the remaining rows
            for (i = l; i < n; ++i) {
                System.out.print(arr[m - 1][i] + ", ");
                cnt++;
            }
            m--;

            if (cnt == total)
                break;

            // Print the last column
            // from the remaining columns
            if (k < m) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(arr[i][n - 1] + ", ");
                    cnt++;
                }
                n--;
            }

            if (cnt == total)
                break;

            // Print the first row
            // from the remaining rows
            if (l < n) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(arr[k][i] + ", ");
                    cnt++;
                }
                k++;
            }
        }
        System.out.print("END");
    }
}