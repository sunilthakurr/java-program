package PriorityQueue;

import java.util.ArrayList;
import java.util.Comparator;

public class Priority_Queue {

    private ArrayList<Integer> heap;

    public Priority_Queue() {
        heap = new ArrayList<>();
    }

    public Priority_Queue(int i, Comparator<Object> reverseOrder) {
    }

    boolean isEmpty() {
        return heap.size() == 0;
    }

    int size() {
        return heap.size();
    }

    int getMin() throws PriorityQueueException {
        if (heap.size() == 0) {
            // throw an exception
            throw new PriorityQueueException();
        }
        return heap.get(0);
    }

    void insert(int element) {
        heap.add(element);
        int childIndex = heap.size() - 1;
        int parentIndex = (childIndex - 1) / 2;

        while (childIndex > 0) {                  // Upward heapify to maintain heap property
            if (heap.get(childIndex) < heap.get(parentIndex)) {
                int temp = heap.get(parentIndex);
                heap.set(parentIndex, heap.get(childIndex));
                heap.set(childIndex, temp);
                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            } else {
                return;
            }
        }
    }

    int removeMin() throws PriorityQueueException {
        // Throw the exception PriorityQueueException if queue is empty
        if (isEmpty()) {
            // Throw an exception
            throw new PriorityQueueException();
        }

        int minEle = getMin();

        //Set the last priority element as the new root
        heap.set(0, heap.get(heap.size() - 1));

        //Remove the last priority element
        heap.remove(heap.size() - 1);

        //Traverse from root to leaf, and swap values if needed to maintain min. heap order property
        int parentIndex = 0;
        int leftChildIndex = 2 * parentIndex + 1, rightChildIndex = 2 * parentIndex + 2;
        while (leftChildIndex < heap.size()) {
            int minIndex = parentIndex;

            if (heap.get(minIndex) > heap.get(leftChildIndex)) {
                minIndex = leftChildIndex;
            }

            if (rightChildIndex < heap.size()) {
                if (heap.get(minIndex) > heap.get(rightChildIndex)) {
                    minIndex = rightChildIndex;
                }
            }

            if (minIndex == parentIndex) {
                return minEle;
            }

            int temp = heap.get(parentIndex);
            heap.set(parentIndex, heap.get(minIndex));
            heap.set(minIndex, temp);

            parentIndex = minIndex;
            leftChildIndex = 2 * parentIndex + 1;
            rightChildIndex = 2 * parentIndex + 2;
        }
        return minEle;

    }
}
