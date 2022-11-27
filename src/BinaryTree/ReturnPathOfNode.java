package BinaryTree;

import java.util.ArrayList;
import java.util.Scanner;

public class ReturnPathOfNode {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the data you want to search : ");
        int data = obj.nextInt();
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
        ArrayList<Integer> list = NodeToRootPath(root, data);

        for (int i = 0; i < list.size(); ++i) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static ArrayList<Integer> NodeToRootPath(BinaryTreeNode<Integer> root, int data) {
        if (root == null)
            return null;
        if (root.data == data) {
            ArrayList<Integer> result = new ArrayList<>();
            result.add(root.data);
            return result;
        }
        ArrayList<Integer> leftOutput = NodeToRootPath(root.left, data);
        if (leftOutput != null) {
            leftOutput.add(root.data);
            return leftOutput;
        }
        ArrayList<Integer> rightOutput = NodeToRootPath(root.right, data);
        if (rightOutput != null) {
            rightOutput.add(root.data);
            return rightOutput;
        } else
            return null;
    }
}
