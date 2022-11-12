package BinaryTree;

//Problem :- We simply want to display every node at K-th node of our binary tree, considering root at depth 0.

import java.util.Scanner;

public class PrintAtDepthK {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Depth you want to print");
        int depth = obj.nextInt();
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
        DepthPrinting(root, depth);
    }

    public static void DepthPrinting(BinaryTreeNode<Integer> root, int K) {
        if (K < 0)
            return;
        if (K == 0) {
            System.out.print(root.data + " ");
            return;
        }
        DepthPrinting(root.left, K - 1);
        DepthPrinting(root.right, K - 1);
    }
}
