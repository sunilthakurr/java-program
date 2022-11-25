package BST;

import BinaryTree.BinaryTreeNode;
import BinaryTree.PrintLevelWise;

import java.util.Scanner;

public class ConstructBSTFromSortedArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = obj.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; ++i) {
            arr[i] = obj.nextInt();
        }
        BinaryTreeNode<Integer> root = BSTFromArray(arr, 0, size - 1);
        PrintLevelWise.printLevelWise(root);
    }

    public static BinaryTreeNode<Integer> BSTFromArray(int[] arr, int si, int ei) {
        if (si > ei)
            return null;
        int mid = si + (ei - si) / 2;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
        root.left = BSTFromArray(arr, si, mid - 1);
        root.right = BSTFromArray(arr, mid + 1, ei);

        return root;
    }
}
