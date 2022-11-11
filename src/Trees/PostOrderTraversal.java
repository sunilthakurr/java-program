package Trees;

public class PostOrderTraversal {
    public static void printPostOrder(TreeNode<Integer> root) {
        if (root == null)
            return;
//        if(root.children.size() == 0)
//            System.out.print(root.data+" ");
        for (int i = 0; i < root.children.size(); ++i) {
            printPostOrder(root.children.get(i));
        }
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLL.takeInputLevelWise();
        printPostOrder(root);
    }
}
