package GLA_Super_150.Assignment4;

import java.util.Scanner;

public class PiyushAndMagicalPark {
    public static void main(String args[]) {
        // Your Code Here
        Scanner obj = new Scanner(System.in);
        int row = obj.nextInt();
        int col = obj.nextInt();
        int minStrength = obj.nextInt();
        int initialStrength = obj.nextInt();

        char[][] arr = new char[row][col];
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                arr[i][j] = obj.next().charAt(0);
            }
        }

        int count = 0;
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                if (initialStrength < minStrength) {
                    count = -1;
                    break;
                }
                if (arr[i][j] == '.' && j != (col - 1)) {
                    initialStrength -= 3;
                } else if (arr[i][j] == '.') {
                    initialStrength -= 2;
                } else if (arr[i][j] == '#') {
                    break;
                } else if (arr[i][j] == '*' && j != (col - 1)) {
                    initialStrength += 4;
                } else if (arr[i][j] == '*') {
                    initialStrength += 5;
                }

            }
        }
        if (count == -1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            System.out.println(initialStrength);
        }
    }
}
