package BST;

import BinaryTree.BinaryTreeNode;
import BinaryTree.TakeInputLevelWise;

public class IsBST2 {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
        OptimizedBSTChecking(root);
        System.out.println("Our Binary tree is BST : " + OptimizedBSTChecking(root).first);
        System.out.println("Maximum Value in Tree is : " + OptimizedBSTChecking(root).second.second);
        System.out.println("Minimum Value in Tree is : " + OptimizedBSTChecking(root).second.first);
    }

    public static Pair<Boolean, Pair<Integer, Integer>> OptimizedBSTChecking(BinaryTreeNode<Integer> root) {
        if (root == null) {
            Pair<Boolean, Pair<Integer, Integer>> result = new Pair<>();
            result.first = true;
            result.second = new Pair<>();
            result.second.first = Integer.MAX_VALUE;
            result.second.second = Integer.MIN_VALUE;

            return result;
        }
        Pair<Boolean, Pair<Integer, Integer>> leftOutput = OptimizedBSTChecking(root.left);
        Pair<Boolean, Pair<Integer, Integer>> rightOutput = OptimizedBSTChecking(root.right);
        int min = Integer.min(root.data, Integer.min(leftOutput.second.first, rightOutput.second.first));
        int max = Integer.max(root.data, Integer.max(leftOutput.second.second, rightOutput.second.second));

        boolean isBST = (root.data > leftOutput.second.second) && (root.data <= rightOutput.second.first) &&
                leftOutput.first && rightOutput.first;
        Pair<Boolean, Pair<Integer, Integer>> result = new Pair<>();
        result.first = isBST;
        result.second.first = min;
        result.second.second = max;
        return result;
    }
}
