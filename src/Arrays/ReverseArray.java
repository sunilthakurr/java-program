package Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = obj.nextInt();
        }
        Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Reverse(int[] arr) {
        int temp;
        int len = arr.length;
        int j = len - 1;
        for (int i = 0; i < len / 2; ++i) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            --j;
        }
    }
}
