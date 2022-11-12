package BinaryTree;

//Problem :- We have to count the total number of leaf nodes in a binary tree

public class NumberOfLeafNodes {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
        System.out.println("Total number of leaf in given Binary tree is : " + LeafCount(root));
    }

    public static int LeafCount(BinaryTreeNode<Integer> root) {
        int leftLeafCount = 0;
        int rightLeafCount = 0;
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null)
            return 1;
        leftLeafCount = LeafCount(root.left);
        rightLeafCount = LeafCount(root.right);
        return leftLeafCount + rightLeafCount;
    }
}
