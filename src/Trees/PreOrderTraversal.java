package Trees;

public class PreOrderTraversal {
    public static void printPreOrder(TreeNode<Integer> root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        for (int i = 0; i < root.children.size(); ++i) {
            printPreOrder(root.children.get(i));
        }
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLL.takeInputLevelWise();
        printPreOrder(root);
    }

}
