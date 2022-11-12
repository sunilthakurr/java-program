package BinaryTree;

import Queue.QueueEmptyException;


public class PrintLevelWise {
    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        if (root == null)
            return;
        QueueUsingLL<BinaryTreeNode<Integer>> q = new QueueUsingLL<>();
        q.enqueue(root);

        while (!q.isEmpty()) {
            String toBePrinted;
            BinaryTreeNode<Integer> front;
            try {
                front = q.dequeue();
            } catch (QueueEmptyException e) {
                throw new RuntimeException(e);
            }
            toBePrinted = front.data + ":";
            BinaryTreeNode<Integer> left = front.left;
            if (left != null) {
                toBePrinted += "L:" + left.data + ",";
                q.enqueue(left);
            } else {
                toBePrinted += "L:-1,";
            }
            BinaryTreeNode<Integer> right = front.right;
            if (right != null) {
                toBePrinted += "R:" + right.data;
                q.enqueue(right);
            } else {
                toBePrinted += "R:-1";
            }
            System.out.println(toBePrinted);


        }
    }
}
