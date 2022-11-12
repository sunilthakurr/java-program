package BinaryTree;

public class PrintTreeRecursively {
    public static void PrintTree(BinaryTreeNode<Integer> root) {
        if (root.data == null)
            return;
        String toBePrinted = root.data + ": ";
        if (root.left != null)
            toBePrinted += "L:" + root.left.data + ", ";
        if (root.right != null)
            toBePrinted += "R:" + root.right.data;
        System.out.println(toBePrinted);
        if (root.left != null)
            PrintTree(root.left);
        if (root.right != null)
            PrintTree(root.right);
    }
}
