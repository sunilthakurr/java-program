package BinaryTree;

import java.util.Scanner;

public class TakeInputRecursively {
    public static BinaryTreeNode<Integer> takeInput(Scanner obj) {
        System.out.println("Enter root Data : ");
        int rootData = obj.nextInt();
        if (rootData == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        root.left = takeInput(obj);
        root.right = takeInput(obj);
        return root;
    }
}
