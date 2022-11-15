package BinaryTree;

//import Pair class to run this program if you take it from github

public class DiameterOfATreeOptimized {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
        System.out.println("Height of Binary Tree is : " + Diameter(root).first);
        System.out.println("Diameter of Binary Tree is : " + Diameter(root).second);
    }

    public static Pair Diameter(BinaryTreeNode<Integer> root) {


        if (root == null) {
            Pair<Integer, Integer> output = new Pair<>();
            output.first = 0;
            output.second = 0;
            return output;
        }
        Pair<Integer, Integer> leftOutput = Diameter(root.left);
        Pair<Integer, Integer> rightOutput = Diameter(root.right);

        int height = 1 + Math.max(leftOutput.first, rightOutput.first);

        int option1 = leftOutput.first + rightOutput.first;
        int option2 = leftOutput.second;
        int option3 = rightOutput.second;

        int diameter = Math.max(option1, Math.max(option2, option3));
        Pair<Integer, Integer> result = new Pair<>();
        result.first = height;
        result.second = diameter;

        return result;
    }
}
