package BinaryTree;


public class RemoveLeafNodes {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
        LeafNodeRemoval(root);
        PrintLevelWise.printLevelWise(root);
    }

    public static BinaryTreeNode<Integer> LeafNodeRemoval(BinaryTreeNode<Integer> root) {
        if (root == null)
            return null;
        if (root.left == null && root.right == null) {
            return null;
        }

        root.left = LeafNodeRemoval(root.left);
        root.right = LeafNodeRemoval(root.right);
        return root;
    }
}
