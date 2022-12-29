package CHEGG;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PetStore {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();
        while (T-- > 0) {
            int N = obj.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; ++i) {
                arr[i] = obj.nextInt();
            }
            Frequency(arr, N);
        }

    }

    static void Frequency(int arr[], int n) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        // Traverse through map and print frequencies
        int temp = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//           System.out.print(entry.getKey() + " " + entry.getValue()+"  ");
            if (entry.getValue() % 2 != 0) {
                temp = 1;
                break;
            }

        }
        if (temp == 1)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}

