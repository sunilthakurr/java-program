package PriorityQueue;


import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestElement {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = obj.nextInt();
        }
        int k = obj.nextInt();
        int res = Klargest(arr, N, k);
        System.out.println(res);
    }

    public static int Klargest(int[] arr, int N, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        if (k == 0)
            return Integer.MIN_VALUE;
        for (int i = 0; i < k; ++i) {
            pq.add(arr[i]);
        }

        for (int i = k; i < N; ++i) {
            if (pq.peek() < arr[i]) {
                pq.poll();
                pq.add(arr[i]);
            }
        }

//        System.out.println(pq);
        if (!pq.isEmpty())
            return pq.peek();
        else
            return Integer.MIN_VALUE;
    }
}
