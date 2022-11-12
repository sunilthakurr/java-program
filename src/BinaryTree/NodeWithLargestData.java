package BinaryTree;

//Assumption :- Here we assume that all nodes have positive values and if root is null we simply return -1.
public class NodeWithLargestData {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
        System.out.println(LargestNodeData(root));
    }

    public static int LargestNodeData(BinaryTreeNode<Integer> root) {
        int max = -1;
        if (root == null)              // base case
            return -1;
        if (root.data > max)
            max = root.data;
        int leftMax = LargestNodeData(root.left);
        if (max < leftMax)
            max = leftMax;
        int rightMax = LargestNodeData(root.right);
        if (max < rightMax)
            max = rightMax;
        return max;
    }
}
