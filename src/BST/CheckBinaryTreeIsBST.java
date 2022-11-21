package BST;

import BinaryTree.BinaryTreeNode;
import BinaryTree.TakeInputLevelWise;

public class CheckBinaryTreeIsBST {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
        System.out.println(isBST(root));
    }

    public static boolean isBST(BinaryTreeNode<Integer> root) {
        if (root == null)
            return true;
        int rootData = root.data;
        int min = maximum(root.left);
        int max = minimum(root.right);
        if (min >= rootData)
            return false;
        if (max < rootData)
            return false;
        boolean lResult = isBST(root.left);
        boolean rResult = isBST(root.right);
        if (lResult && rResult)
            return true;
        return false;

    }

    public static int minimum(BinaryTreeNode<Integer> root) {
        if (root == null)
            return Integer.MAX_VALUE;
        return Integer.min(root.data, Math.min(minimum(root.left), minimum(root.right)));

    }

    public static int maximum(BinaryTreeNode<Integer> root) {
        if (root == null)
            return Integer.MIN_VALUE;
        return Integer.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
    }
}

//Time-Complexity :- O(n^2)
