package GLA_Super_150.Assignment3;

import java.util.Scanner;

public class TransposeOfSquareMatrix {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int row = obj.nextInt();

        int[][] arr = new int[row][row];

        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < row; ++j) {
                arr[i][j] = obj.nextInt();
            }
        }
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < row; ++j) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }

    }
}
