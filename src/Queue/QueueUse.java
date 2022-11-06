package Queue;

public class QueueUse {
    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray();
        for (int i = 0; i < 5; ++i) {

            queue.enqueue(i);

        }


        while (!queue.isEmpty()) {
            try {
                System.out.println(queue.dequeue());
            } catch (QueueEmptyException e) {

            }
        }
    }
}
