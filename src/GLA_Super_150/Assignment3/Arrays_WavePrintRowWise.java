package GLA_Super_150.Assignment3;

import java.util.Scanner;

public class Arrays_WavePrintRowWise {
    public static void main(String args[]) {
        // Your Code Here
        Scanner obj = new Scanner(System.in);
        int row = obj.nextInt();
        int col = obj.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                arr[i][j] = obj.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < col; j++)
                    System.out.print(arr[i][j] + ", ");
            } else {
                for (int j = col - 1; j >= 0; j--)
                    System.out.print(arr[i][j] + ", ");
            }
        }
        System.out.print("END");
    }
}

