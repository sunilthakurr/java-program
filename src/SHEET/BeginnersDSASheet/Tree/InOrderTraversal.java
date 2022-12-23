package SHEET.BeginnersDSASheet.Tree;

import java.util.ArrayList;


public class InOrderTraversal {
    public static void helper(Node root) {
        if (root == null)
            return;
        helper(root.left);
        System.out.print(root.data + " ");
        helper(root.right);
    }

    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> list = new ArrayList<Integer>();
        helper(root);
        return list;

    }
}

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

