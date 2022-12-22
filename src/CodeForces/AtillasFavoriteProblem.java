package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class AtillasFavoriteProblem {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();
        while (T != 0) {
            int len = obj.nextInt();
            String str = obj.next();
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            System.out.println(arr[len - 1] - 'a' + 1);


            --T;
        }
    }
}
