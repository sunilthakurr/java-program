package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class MediumNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();
        while (T != 0) {
            int[] arr = new int[3];
            for (int i = 0; i < 3; ++i) {
                arr[i] = obj.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[1]);
            --T;
        }
    }
}
