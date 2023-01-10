package PriorityQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class StringLengthSorting {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        String[] arr = new String[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = obj.next();
        }
        StringLengthComparator stringComparator = new StringLengthComparator();
        PriorityQueue<String> pq = new PriorityQueue<>(stringComparator);
        for (String str : arr) {
            pq.add(str);
        }
        while (!pq.isEmpty())
            System.out.print(pq.remove() + " ");
    }
}
