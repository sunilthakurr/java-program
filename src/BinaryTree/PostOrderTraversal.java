package BinaryTree;


public class PostOrderTraversal {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
        postOrderTraversal(root);
    }

    public static void postOrderTraversal(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");

    }
}
