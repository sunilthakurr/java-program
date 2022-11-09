package Trees;

import Queue.QueueEmptyException;
import Queue.QueueUsingLL;

import java.util.Scanner;

public class takeInputLL {
    public static TreeNode<Integer> takeInputLevelWise() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter root data");
        int rootData = obj.nextInt();
        QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        TreeNode<Integer> root = new TreeNode<>(rootData);
        pendingNodes.enqueue(root);
        while (!pendingNodes.isEmpty()) {
            try {
                TreeNode<Integer> frontNode = pendingNodes.dequeue();
                System.out.println("Enter the no. of children of : " + frontNode.data);
                int numChildren = obj.nextInt();
                for (int i = 0; i < numChildren; ++i) {
                    System.out.println("Enter " + (i + 1) + " th child of " + frontNode.data);
                    int child = obj.nextInt();
                    TreeNode<Integer> childNode = new TreeNode<Integer>(child);
                    frontNode.children.add(childNode);
                    pendingNodes.enqueue(childNode);
                }
            } catch (QueueEmptyException e) {
//                throw new RuntimeException(e);
                return null;
            }


        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLevelWise();
        PrintRecursively.print(root);
    }
}
