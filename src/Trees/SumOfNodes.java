package Trees;

public class SumOfNodes {
    public static int nodeSum(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int sum = root.data;
        for (int i = 0; i < root.children.size(); ++i) {
            sum += nodeSum(root.children.get(i));
        }
        return sum;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLL.takeInputLevelWise();
        System.out.println(nodeSum(root));
    }
}
