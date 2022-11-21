package BST;

import BinaryTree.BinaryTreeNode;
import BinaryTree.TakeInputLevelWise;

import java.util.Scanner;

public class PrintInRange {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
        System.out.println("Enter the lower range ");
        int k1 = obj.nextInt();
        System.out.println("Enter the upper range ");
        int k2 = obj.nextInt();
        DisplayInRange(root, k1, k2);
    }

    public static void DisplayInRange(BinaryTreeNode<Integer> root, int k1, int k2) {
        if (root == null)
            return;
        int rootData = root.data;

        if (rootData > k1)
            DisplayInRange(root.left, k1, k2);
        if (rootData >= k1 && rootData <= k2)
            System.out.print(rootData + " ");
        if (rootData < k2) {
            DisplayInRange(root.right, k1, k2);
        }

    }
}
