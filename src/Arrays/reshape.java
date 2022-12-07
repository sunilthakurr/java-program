package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class reshape {
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
                int nrow = obj.nextInt();
                int ncol = obj.nextInt();
                int[][] arr2 = new int[nrow][ncol];
                arr2 = matrixReshape(arr, nrow, ncol);
                for (int i = 0; i < nrow; ++i) {
                        for (int j = 0; j < ncol; ++j) {
                                System.out.print(arr2[i][j] + " ");
                        }
                        System.out.println();
                }
        }

        public static int[][] matrixReshape(int[][] mat, int r, int c) {
                int[][] m = new int[r][c];
                ArrayList<Integer> l = new ArrayList<>();

                for (int[] a : mat) {
                        for (int i : a) {
                                l.add(i);
                        }
                }
                if (l.size() != r * c)
                        return mat;


                int k = 0;
                for (int row = 0; row < r; row++) {
                        for (int col = 0; col < c; col++) {
                                m[row][col] = l.get(k);
                                k++;
                        }
                }


                return m;
        }

}
