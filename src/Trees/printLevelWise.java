package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class printLevelWise {
    public static void printLL(TreeNode<Integer> root) {
        Queue<TreeNode<Integer>> q = new LinkedList<>();
        if (root == null) {
            return;
        }
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            TreeNode<Integer> node = q.poll();
            if (node != null) {
                System.out.print(node.data + " ");
                for (int i = 0; i < node.children.size(); ++i) {
                    q.add(node.children.get(i));
                }
            } else {
                System.out.println();
                if (!q.isEmpty()) {
                    q.add(null);
                }
            }
        }

    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLL.takeInputLevelWise();
        printLL(root);
    }
}
