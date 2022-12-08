package GLA_Super_150.Assignment4;

import java.util.Scanner;

public class MillisGallery {

    public static void main(String args[]) {


        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int k = s.nextInt();
        int i = 1;
        int c = 0;
        if (n >= 3) {
            while (i < n - 1) {
                if (arr[i] == 0 && arr[i + 1] == 0 && arr[i - 1] == 0) {
                    c++;
                    arr[i] = 1;

                }
                i++;
            }
            if (arr[0] == 0 && arr[1] != 1) {
                c++;
                arr[0] = 1;
            }
            if (arr[n - 1] == 0 && arr[n - 2] == 0) {
                c++;
                arr[n - 1] = 1;
            }
        } else if (n == 2) {
            if (arr[0] == 0 && arr[1] == 0) c++;
        } else {
            if (arr[0] == 0) c++;
        }
        if (c >= k)

            System.out.println(true);


        else {
            System.out.println(false);
        }
    }
}

