package GLA_Super_150.Assignment4;

import java.util.HashMap;
import java.util.Scanner;

public class WorldTestChampionShip {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = obj.nextInt();
        }
        int result = largest_subarray(arr, N);
        System.out.println(result);
    }

    public static int largest_subarray(int a[], int n) {
        HashMap<Integer,
                Integer> index = new HashMap<Integer,
                Integer>();
        int ans = 0;
        for (int i = 0, j = 0; i < n; i++) {
            j = Math.max(index.containsKey(a[i]) ? index.get(a[i]) : 0, j);
            ans = Math.max(ans, i - j + 1);
            index.put(a[i], i + 1);
        }
        return ans;
    }
}
