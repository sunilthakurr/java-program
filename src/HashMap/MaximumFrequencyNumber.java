package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class MaximumFrequencyNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = obj.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elemeents of array");
        for (int i = 0; i < size; ++i) {
            arr[i] = obj.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int temp;
        int max = 0;
        int maxele = arr[0];
        for (Integer i : arr) {        // first loop for storing the elements with it's frequency into hashmap

            if (map.containsKey(i)) {
                temp = map.get(i) + 1;
                map.put(i, temp);

            } else {
                map.put(i, 1);
            }
        }
        for (Integer i : arr) {              // second loop for finding first maximum occuring element
            if (map.containsKey(i)) {
                temp = map.get(i);
                if (temp > max) {
                    max = temp;
                    maxele = i;
                }
            }
        }
        System.out.println(maxele);
    }
}
