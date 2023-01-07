package PriorityQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KLargestElement {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = obj.nextInt();
        }
        int k = obj.nextInt();
        KLargest(arr, k);
    }

    public static void KLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; ++i) {        // supposing that our first k element is the largest k elements
            pq.add(arr[i]);
        }
        for (int i = k; i < arr.length; ++i) {   // checking if root is less than after first k elements then we replace it
            int min = pq.peek();
            if (min < arr[i]) {
                pq.remove();
                pq.add(arr[i]);
            }
        }
        while (!pq.isEmpty()) {       // displaying k largest element
            System.out.print(pq.remove() + " ");
        }
    }
}
