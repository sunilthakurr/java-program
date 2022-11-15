package BinaryTree;

public class BalancedTreeReturnUpdated {
    public int height;
    public boolean isBalanced;

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
        System.out.println(isBalancedBetter(root).isBalanced);
        PrintLevelWise.printLevelWise(root);
    }

    public static BalancedTreeReturnUpdated isBalancedBetter(BinaryTreeNode<Integer> root) {
        if (root == null) {
            int height = 0;
            boolean isBal = true;
            BalancedTreeReturnUpdated ans = new BalancedTreeReturnUpdated();
            ans.height = height;
            ans.isBalanced = isBal;
            return ans;
        }
        BalancedTreeReturnUpdated leftOutput = isBalancedBetter(root.left);
        BalancedTreeReturnUpdated rightOutput = isBalancedBetter(root.right);
        boolean isBal = true;
        int height = 1 + Math.max(leftOutput.height, rightOutput.height);

        if (Math.abs(leftOutput.height - rightOutput.height) > 1) {
            isBal = false;
        }
        if (!leftOutput.isBalanced || !rightOutput.isBalanced) {
            isBal = false;
        }
        BalancedTreeReturnUpdated ans = new BalancedTreeReturnUpdated();
        ans.height = height;
        ans.isBalanced = isBal;
        return ans;
    }
}


//Time-Complexity :- O(n)
