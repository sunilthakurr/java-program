package GLA_Super_150.Assignment3;

import java.util.Scanner;

public class SpiralPrintClockWise {
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
        PrintSpiral(arr);

    }

    public static void PrintSpiral(int[][] arr) {

        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        int total = (maxr + 1) * (maxc + 1);
        int count = 0;
        while (count != total) {

            for (int i = minc; i <= maxc && count < total; ++i) {
                System.out.print(arr[minr][i] + ", ");
                ++count;
            }
            minr++;
            for (int i = minr; i <= maxr && count < total; ++i) {
                System.out.print(arr[i][maxc] + ", ");
                ++count;

            }
            maxc--;
            for (int i = maxc; i >= minc && count < total; --i) {
                System.out.print(arr[maxr][i] + ", ");
                ++count;
            }
            maxr--;
            for (int i = maxr; i >= minr && count < total; --i) {
                System.out.print(arr[i][minc] + ", ");
                ++count;
            }
            minc++;
        }
        System.out.print("END");

    }
}
