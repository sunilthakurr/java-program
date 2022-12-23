package SHEET.BeginnersDSASheet.Tree;

import java.util.ArrayList;

public class PostOrderTraversal {
    public static void helper(Node root) {
        if (root == null)
            return;
        helper(root.left);
        helper(root.right);
        System.out.print(root.data + " ");
    }

    ArrayList<Integer> postOrder(Node root) {
        // Your code goes here
        ArrayList<Integer> list = new ArrayList<Integer>();
        helper(root);
        return list;
    }
}
