package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; ++i) {
            arr[i] = obj.nextInt();
        }
        Arrays.sort(arr);
        sortedWithoutDuplicates(arr);
    }

    public static void sortedWithoutDuplicates(int[] arr) {
        int size = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i = 1; i < size; ++i) {
            if (arr[i] != arr[i - 1])
                list.add(arr[i]);
        }
        int[] arr2 = new int[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            arr2[i] = list.get(i);
        }
        System.out.println(Arrays.toString(arr2));
    }


}
