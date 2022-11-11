package GLA_Super_150.Assignment3;

import java.util.Scanner;

public class ArraysWavePrintColumnWise {
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
        WavePrint(row, col, arr);

    }

    public static void WavePrint(int m, int n, int[][] arr) {

        // Loop to traverse matrix
        for (int j = 0; j < n; j++) {

            // If the current column
            // is even indexed, print
            // it in forward order
            if (j % 2 == 0) {
                for (int i = 0; i < m; i++) {
                    System.out.print(arr[i][j] + ", ");
                }
            }

            // If the current column
            // is odd indexed, print
            // it in reverse order
            else {
                for (int i = m - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + ", ");
                }
            }
        }
        System.out.print("END");
    }
}
