package BinaryTree;


import Queue.QueueEmptyException;
import Queue.QueueUsingLL;

import java.util.Scanner;

public class TakeInputLevelWise {

    public static BinaryTreeNode<Integer> takeInputLevelWise() {
        Scanner obj = new Scanner(System.in);
        QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        System.out.println("Enter root Data");
        int rootData = obj.nextInt();
        if (rootData == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);

        pendingNodes.enqueue(root);
        while (!pendingNodes.isEmpty()) {
            BinaryTreeNode<Integer> front;
            try {
                front = pendingNodes.dequeue();

            } catch (QueueEmptyException e) {
//                throw new RuntimeException(e);
                return null;
            }
            System.out.println("Enter left child of " + front.data);
            int leftchild = obj.nextInt();
            if (leftchild != -1) {
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftchild);
                front.left = child;
                pendingNodes.enqueue(child);
            }
            System.out.println("Enter right child of " + front.data);
            int rightchild = obj.nextInt();
            if (rightchild != -1) {
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightchild);
                front.right = child;
                pendingNodes.enqueue(child);
            }
        }
        return root;

    }
}
