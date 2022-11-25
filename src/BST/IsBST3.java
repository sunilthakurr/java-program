package BST;

import BinaryTree.BinaryTreeNode;
import BinaryTree.TakeInputLevelWise;

public class IsBST3 {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
        System.out.println(isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    public static boolean isBST(BinaryTreeNode<Integer> root, int min, int max) {
        if (root == null)
            return true;

        if (root.data < min || root.data > max)
            return false;
        boolean isLeftOK = isBST(root.left, min, root.data - 1);
        boolean isRightOK = isBST(root.right, root.data, max);

        return isLeftOK && isRightOK;
    }

}
