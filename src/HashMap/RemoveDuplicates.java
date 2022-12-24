package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = obj.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < size; ++i) {
            arr[i] = obj.nextInt();
        }
        HashMap<Integer, Boolean> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int j : arr) {
            if (!map.containsKey(j)) {
                list.add(j);
                map.put(j, true);
            }
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
