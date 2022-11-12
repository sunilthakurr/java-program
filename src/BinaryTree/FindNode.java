package BinaryTree;

import java.util.Scanner;

public class FindNode {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter data you want to search");
        int data = obj.nextInt();
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
        System.out.println(isPresent(root, data));
    }

    public static boolean isPresent(BinaryTreeNode<Integer> root, int X) {
        if (root == null)
            return false;
        if (root.data == X)
            return true;
        boolean temp = isPresent(root.left, X);
        if (temp)
            return true;
        boolean flag = isPresent(root.right, X);
        if (flag)
            return true;
        return false;
    }
}
