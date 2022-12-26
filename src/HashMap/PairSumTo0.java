package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class PairSumTo0 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = obj.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < size; ++i) {
            arr[i] = obj.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;
        for (Integer i : arr) {
            if (map.containsKey(-i)) {
                count += map.get(-i);
            }
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        System.out.println(count);
    }
}
