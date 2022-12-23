package SHEET.BeginnersDSASheet.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    //Function to return the level order traversal of a tree.
    static ArrayList<Integer> levelOrder(Node node) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        helper(node);
        return list;
    }

    public static void helper(Node node) {
        if (node == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        System.out.print(node.data + " ");

        while (!q.isEmpty()) {
            Node front = q.poll();
            // System.out.print(front.data+" ");
            if (front.left != null) {
                System.out.print(front.left.data + " ");
                q.add(front.left);
            }
            if (front.right != null) {
                System.out.print(front.right.data + " ");
                q.add(front.right);
            }

        }

    }
}




