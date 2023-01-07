package PriorityQueue;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Heap_Sort {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = obj.nextInt();
        }
        HeapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void HeapSort(int[] arr) {
        int N = arr.length;
        PriorityQueue<Integer> pr = new PriorityQueue<>();
        for (int i : arr) {
            pr.add(i);
        }
        System.out.println(pr.peek());

        for (int i = 0; i < N; ++i) {
            arr[i] = pr.remove();
        }
    }
}
