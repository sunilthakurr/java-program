package SHEET.BeginnersDSASheet.Tree;

import java.util.ArrayList;

public class PreOrderTraversal {
    final static ArrayList<Integer> list = new ArrayList<>();

    static ArrayList<Integer> preorder(Node root) {
        helper(root);
        return list;

    }

    public static void helper(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");

        helper(root.left);
        helper(root.right);

    }
}
