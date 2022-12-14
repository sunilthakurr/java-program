package Queue;

public class QueueUsingArray {
    private int size;
    private int front;
    private int rear;
    private int[] data;

    public QueueUsingArray() {
        int size = 0;
        int front = -1;
        int rear = -1;
        data = new int[10];
    }

    public QueueUsingArray(int capacity) {
        int size = 0;
        int front = -1;
        int rear = -1;
        data = new int[capacity];
    }

    public int size() {
        return size;
    }

    boolean isEmpty() {
        if (size() == 0)
            return true;
        return false;
    }

    public int front() throws QueueEmptyException {
        if (size() == 0) {
            QueueEmptyException e = new QueueEmptyException();
            throw e;
        }
        return data[front];
    }

    void enqueue(int element) {
        if (size == data.length) {
            doubleCapacity();
        }
        if (size == 0)
            ++front;

        rear = (rear + 1) % data.length;
//        rear++;
//        if(rear + 1 == data.length){
//            rear = 0;
//        }
        size++;
        data[rear] = element;
    }

    private void doubleCapacity() {
        int[] temp = data;
        int[] data = new int[temp.length * 2];
        int index = 0;
        for (int i = front; i < temp.length; ++i) {
            data[index] = temp[i];
            ++index;
        }
        for (int i = 0; i < front; ++i) {
            data[index] = temp[i];
            ++index;
        }
        front = 0;
        rear = temp.length - 1;
    }

    int dequeue() throws QueueEmptyException {
        if (size == 0)
            throw new QueueEmptyException();
        int temp = data[front];
        front = (front + 1) % data.length;
//        front++;
//        if(front + 1 == data.length){
//            front = 0;
//        }
        size--;
        return temp;
    }
}
