package BinaryTree;

import java.util.Scanner;

public class TreeUseNaive {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        BinaryTreeNode<Integer> root = TakeInputRecursively.takeInput(obj);
        PrintTreeRecursively.PrintTree(root);
        obj.close();
    }
}
