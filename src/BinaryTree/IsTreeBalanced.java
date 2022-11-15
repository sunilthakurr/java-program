package BinaryTree;

//A Binary tree is said to be balanced if difference of its left node height and right node height
//is not greater than 1.

public class IsTreeBalanced {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
        System.out.println(IsBalanced(root));
    }

    public static boolean IsBalanced(BinaryTreeNode<Integer> root) {
        if (root == null)       // if root is null that means it has 0 left child and 0 right child
            return true;

        int leftHeight = Height(root.left);      // finding the left height for comparison
        int rightHeight = Height(root.right);    // finding right height for comparison

        if (Math.abs(leftHeight - rightHeight) > 1)   // checking if diff. is greater than 1 then simply return false
            return false;

        boolean isLeftBalanced = IsBalanced(root.left);   // Checking the same thing for our left child recursively
        boolean isRightBalanced = IsBalanced(root.right);  // checking the same thing for our right child recursively

        return isLeftBalanced && isRightBalanced;   // if any of one is false we will simply return false otherwise true
    }

    //Function to find height of any Node
    public static int Height(BinaryTreeNode<Integer> root) {
        if (root == null)   // If root is null then the height is 0
            return 0;
        int leftHeight = Height(root.left);    // finding the left height recursively
        int rightHeight = Height(root.right);   // finding the right height recursively

        return 1 + Math.max(leftHeight, rightHeight);  // return 1 + max of both height because if root is not null then we count it as 1
    }
}

//Time Complexity :- O(n.h) where h is the height of tree
