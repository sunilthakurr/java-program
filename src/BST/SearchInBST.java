package BST;

import BinaryTree.BinaryTreeNode;
import BinaryTree.TakeInputLevelWise;

import java.util.Scanner;

public class SearchInBST {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
        int k = obj.nextInt();
        System.out.println(isPresent(root, k));
    }

    public static boolean isPresent(BinaryTreeNode<Integer> root, int k) {
        if (root == null)
            return false;
        int temp = root.data;

        if (temp == k)
            return true;

        if (temp > k)
            return isPresent(root.left, k);
        else
            return isPresent(root.right, k);

    }
}
