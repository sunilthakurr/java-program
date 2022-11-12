package BinaryTree;

public class NumberOfNodes {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
//        PrintLevelWise.printLevelWise(root);
        System.out.println(NumberOfNodes(root));
    }

    public static int NumberOfNodes(BinaryTreeNode<Integer> root) {
        int count = 0;
//        int result = 0;
        if (root == null) {
            return 0;
        }
        count = 1;

        count += NumberOfNodes(root.left);
        count += NumberOfNodes(root.right);


        return count;

    }
}
