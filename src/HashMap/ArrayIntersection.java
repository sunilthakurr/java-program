package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class ArrayIntersection {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
//        System.out.println("Enter the size of first array");
        int size1 = obj.nextInt();
        int[] arr1 = new int[size1];
//        System.out.println("Enter the elements of first array");
        for (int i = 0; i < size1; ++i) {
            arr1[i] = obj.nextInt();
        }
//        System.out.println("Enter the size of second array");
        int size2 = obj.nextInt();
        int[] arr2 = new int[size2];
//        System.out.println("Enter the elements of second array");
        for (int i = 0; i < size2; ++i) {
            arr2[i] = obj.nextInt();
        }
        printIntersection(arr1, size1, arr2, size2);
    }

    public static void printIntersection(int[] arr1, int size1, int[] arr2, int size2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < size1; ++i) {
            if (!map.containsKey(arr1[i])) {
                map.put(arr1[i], 1);
            } else {
                map.put(arr1[i], map.get(arr1[i]) + 1);
            }

        }
        for (int i = 0; i < size2; ++i) {
            Integer val = map.get(arr2[i]);
            if (map.containsKey(arr2[i]) && val != 0) {
                System.out.println(arr2[i]);
                map.put(arr2[i], map.get(arr2[i]) - 1);
            }
        }
    }
}
