package GLA_Super_150.Assignment3;

import java.util.Scanner;

public class MatrixSearch {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();
        int col = obj.nextInt();
        int[][] arr = new int[T][col];
        for (int i = 0; i < T; ++i) {
            for (int j = 0; j < col; ++j) {
                arr[i][j] = obj.nextInt();
            }
        }
        int count = 0;
        int target = obj.nextInt();
        for (int i = 0; i < T; ++i) {
            for (int j = 0; j < col; ++j) {
                if (arr[i][j] == target) {
                    System.out.println(1);
                    count = 1;
                }
            }
        }
        if (count == 0)
            System.out.println(0);

    }
}
