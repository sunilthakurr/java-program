package BST;

import BinaryTree.BinaryTreeNode;
import BinaryTree.TakeInputLevelWise;

import java.util.ArrayList;
import java.util.Scanner;

public class FindPathInBST {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the data you want path of : ");
        int data = obj.nextInt();
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
        ArrayList<Integer> list = PathOfNode(root, data);
        System.out.println(list.toString());

    }

    public static ArrayList<Integer> PathOfNode(BinaryTreeNode<Integer> root, int data) {
        if (root == null)
            return null;
        if (root.data == data) {
            ArrayList<Integer> result = new ArrayList<>();
            result.add(data);
            return result;
        }
        if (root.data > data) {
            ArrayList<Integer> leftResult = PathOfNode(root.left, data);
            if (leftResult != null) {
                leftResult.add(root.data);
                return leftResult;
            }
        }
        if (root.data < data) {
            ArrayList<Integer> rightResult = PathOfNode(root.right, data);
            if (rightResult != null) {
                rightResult.add(root.data);
                return rightResult;
            }
        }
        return null;
    }
}
