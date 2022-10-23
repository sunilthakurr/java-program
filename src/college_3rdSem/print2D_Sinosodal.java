package college_3rdSem;

import java.util.Scanner;

public class print2D_Sinosodal {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int row = obj.nextInt();
        int col = obj.nextInt();
        int[][] arr = new int[row][col];

        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                arr[i][j] = obj.nextInt();
            }
        }
        for (int i = 0; i < col; ++i) {
            if (i % 2 == 0) {
                for (int j = 0; j < row; ++j) {
                    System.out.print(arr[i][j] + "\t");
                }

            } else {
                for (int j = row; j >= 0; --j) {
                    System.out.print(arr[i][j] + "\t");
                }
            }
        }
    }
}
