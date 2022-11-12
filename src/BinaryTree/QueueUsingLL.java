package BinaryTree;


import Queue.Node;
import Queue.QueueEmptyException;

public class QueueUsingLL<T> {

    private Queue.Node<T> front;
    private Queue.Node<T> rear;
    private int size;

    public QueueUsingLL() {
        front = null;
        rear = null;
        size = 0;
    }

    int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    T front() throws Queue.QueueEmptyException {
        if (size == 0) {
            throw new Queue.QueueEmptyException();
        }
        return front.data;
    }

    public void enqueue(T element) {
        Queue.Node<T> newNode = new Node<>(element);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;

    }

    public T dequeue() throws Queue.QueueEmptyException {
        if (size == 0) {
            throw new QueueEmptyException();
        }

        T temp = front.data;
        front = front.next;
        if (size == 1) {
            rear = null;
        }
        size--;

        return temp;
    }


}
