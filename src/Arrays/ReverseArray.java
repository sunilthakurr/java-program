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

    public static String isPossible(int[] arr, int N) {
        if (N <= 2)
            return "YES";
        // int j = N - 1;
        //int temp = arr[0];
        //int flag =
        //int count = 0;
        //for(int i = 1; i < N; ++i){
        //    if(temp != arr[i])
        //         ++count;

        //}
//        if(count > 2){
//            return "YES";
//        }

        if (arr[0] == arr[N - 1])
            return "YES";
        else if (arr[0] == arr[N - 2])
            return "YES";
        else if (arr[1] == arr[N - 1])
            return "YES";

        // return "NO";
        int temp = arr[0];
        int flag = arr[N - 1];
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < N; ++i) {
            if (arr[i] != flag || arr[i] != flag)
                ++count;
        }
        if (count <= 2)
            return "YES";
        return "NO";

    }
}
