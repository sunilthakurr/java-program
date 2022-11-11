package Trees;

public class CountLeafNodes {
    public static int LeafNodes(TreeNode<Integer> root) {
        if (root == null)
            return 0;
        if (root.children.size() == 0)
            return 1;
        int count = 0;
        for (int i = 0; i < root.children.size(); ++i) {
            count += LeafNodes(root.children.get(i));
        }
        return count;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLL.takeInputLevelWise();
        System.out.println(LeafNodes(root));
    }
}
