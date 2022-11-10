package Trees;

public class HeightOfTree {
    public static int height(TreeNode<Integer> root) {

        if (root == null)
            return 0;
        int height = 0;
        for (int i = 0; i < root.children.size(); ++i) {
            TreeNode<Integer> childNode = root.children.get(i);
            int temp = height(childNode);        // for storing height of each child node
            if (temp > height) {                   // comparing height of each child node & storing max height
                height = temp;
            }
        }
        return height + 1;

    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLL.takeInputLevelWise();
        System.out.println(height(root));
    }
}
