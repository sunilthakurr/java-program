package GLA_Super_150.Assignment3;

import java.util.Scanner;

public class RotateImage {
    public static void main(String args[]) {
        // Your Code Here
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                arr[i][j] = obj.nextInt();
            }
        }
        rotateMatrix(N, arr);
        displayMatrix(N, arr);
    }

    public static void rotateMatrix(int N, int mat[][]) {
        // Consider all squares one by one
        for (int x = 0; x < N / 2; x++) {
            // Consider elements in group
            // of 4 in current square
            for (int y = x; y < N - x - 1; y++) {
                // Store current cell in
                // temp variable
                int temp = mat[x][y];

                // Move values from right to top
                mat[x][y] = mat[y][N - 1 - x];

                // Move values from bottom to right
                mat[y][N - 1 - x]
                        = mat[N - 1 - x][N - 1 - y];

                // Move values from left to bottom
                mat[N - 1 - x][N - 1 - y]
                        = mat[N - 1 - y][x];

                // Assign temp to left
                mat[N - 1 - y][x] = temp;
            }
        }
    }

    // Function to print the matrix
    public static void displayMatrix(int N, int mat[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(mat[i][j] + " ");

            System.out.print("\n");
        }
        System.out.print("\n");
    }
}

