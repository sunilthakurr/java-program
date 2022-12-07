package GLA_Super_150.Assignment4;

import java.util.Scanner;

public class ReshapeTheMatrix {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int row = obj.nextInt();
        int col = obj.nextInt();
        int[][] arr = new int[row][col];
        int[] temp = new int[row * col];
        int counter = 0;
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                arr[i][j] = obj.nextInt();
                temp[counter++] = arr[i][j];
            }
        }
        int nRow = obj.nextInt();
        int nCol = obj.nextInt();

        if (nRow * nCol != row * col) {
            display(arr, row, col);
        } else {
            counter = 0;
            int[][] arr2 = new int[nRow][nCol];
            for (int i = 0; i < nRow; ++i) {
                for (int j = 0; j < nCol; ++j) {
                    arr2[i][j] = temp[counter++];
                }
            }
            display(arr2, nRow, nCol);
        }
    }

    public static void display(int[][] arr, int row, int col) {
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}
