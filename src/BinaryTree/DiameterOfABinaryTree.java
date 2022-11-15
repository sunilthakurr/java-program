package BinaryTree;

public class DiameterOfABinaryTree {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
        int diameter = Diameter(root);
        System.out.println("Diameter of given binary tree is : " + diameter);
    }

    public static int Diameter(BinaryTreeNode<Integer> root) {
        if (root == null)
            return 0;
        int option1 = height(root.left) + height(root.right);   // In case we have both the node and complex
        int option2 = height(root.left);                      // If there is no right node
        int option3 = height(root.right);                     // If there is no left node

        return Math.max(option1, Math.max(option2, option3));  // simply return the max of all three
    }

    public static int height(BinaryTreeNode<Integer> root) {   // Method to find height of tree
        if (root == null)
            return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}

//Time Complexity :-
//                Average Case : O(n log n)
//                Worst case   : O(n.h)       where h is the height of node
