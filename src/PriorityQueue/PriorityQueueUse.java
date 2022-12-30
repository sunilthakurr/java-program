package PriorityQueue;

import java.util.Scanner;

public class PriorityQueueUse {
    public static void main(String[] args) throws PriorityQueueException {
        Scanner obj = new Scanner(System.in);
        Priority_Queue pq = new Priority_Queue();
        int N = obj.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = obj.nextInt();
        }
        for (int i : arr) {
            pq.insert(i);
        }
        for (int i = 0; i < pq.size(); ++i) {
            System.out.print(pq.removeMin() + " ");
        }
        System.out.println();

    }
}
// this is simply nothing but heap sort
// Time complexity :- O(nlogN)
// Space complexity :- O(n)
