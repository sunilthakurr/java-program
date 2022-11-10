package Trees;

public class LargestNode {
    public static int LargestNodeElement(TreeNode<Integer> root) {
        if (root == null) {                   // Not a base case ---------> Edge case
            return Integer.MIN_VALUE;
        }
        int max = root.data;
        for (int i = 0; i < root.children.size(); ++i) {
            int temp = LargestNodeElement(root.children.get(i));
            if (temp > max) {
                max = temp;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLL.takeInputLevelWise();
        System.out.println(LargestNodeElement(root));
    }
}
