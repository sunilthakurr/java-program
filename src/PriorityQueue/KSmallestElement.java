package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KSmallestElement {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = obj.nextInt();
        }
        int k = obj.nextInt();
        KSmallest(arr, k);
    }

    public static void KSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < k; ++i) {
            pq.add(arr[i]);
        }
        for (int i = k; i < arr.length; ++i) {
            int min = pq.peek();
            if (min > arr[i]) {
                pq.remove();
                pq.add(arr[i]);
            }
        }
        while (!pq.isEmpty()) {
            System.out.print(pq.remove() + " ");
        }
    }
}
