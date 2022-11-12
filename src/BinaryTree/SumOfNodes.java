package BinaryTree;

public class SumOfNodes {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
        System.out.println(sum(root));

    }

    public static int sum(BinaryTreeNode<Integer> root) {
        int sum = 0;
        if (root == null)
            return 0;
        sum = root.data;
        sum += sum(root.left);
        sum += sum(root.right);
        return sum;
    }
}
