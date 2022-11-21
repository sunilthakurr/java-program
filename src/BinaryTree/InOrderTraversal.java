package BinaryTree;

public class InOrderTraversal {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
        inOrderTraversal(root);
    }

    public static void inOrderTraversal(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

}
