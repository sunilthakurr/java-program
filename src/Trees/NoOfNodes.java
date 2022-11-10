package Trees;

//Here we count the number of nodes in a tree
public class NoOfNodes {
    public static int nodeCount(TreeNode<Integer> root) {
        if (root == null)           // Not a base case -------> Edge case -------> occurs only when user provide root null
            return 0;
        int count = 1;
        for (int i = 0; i < root.children.size(); ++i) {           // It is our base case
            count += nodeCount(root.children.get(i));
        }
        return count;
    }
}
