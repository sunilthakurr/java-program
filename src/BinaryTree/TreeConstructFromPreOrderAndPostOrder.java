package BinaryTree;

import java.util.Scanner;

public class TreeConstructFromPreOrderAndPostOrder {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the no. of elements in tree");
        int size = obj.nextInt();
        System.out.println("Enter the elements of tree in InOrder");
        int[] inOrder = new int[size];
        for (int i = 0; i < size; ++i) {
            inOrder[i] = obj.nextInt();
        }
        System.out.println("Enter the elements of tree in PreOrder");
        int[] preOrder = new int[size];
        for (int i = 0; i < size; ++i) {
            preOrder[i] = obj.nextInt();
        }
        BinaryTreeNode<Integer> root = buildTree(inOrder, 0, size - 1, preOrder, 0, size - 1);
        PrintLevelWise.printLevelWise(root);
    }

    public static BinaryTreeNode<Integer> buildTree(int[] inOrder, int Isi, int Iei, int[] preOrder, int Psi, int Pei) {
        if (Psi > Pei) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(preOrder[Psi]);

        int count = -1;   // use to store the index of root data in In-Order
        for (int i = Isi; i <= Iei; ++i) {
            if (inOrder[i] == root.data) {
                count = i;
                break;
            }
        }
        // Index range for starting and ending index of left InOrder
        int siInleft = Isi;
        int eiInleft = count - 1;

        // Index range for starting and ending index of left PreOrder
        int siPreLeft = Psi + 1;
        int leftSublength = eiInleft - siInleft + 1;
        int eiPreLeft = leftSublength + siPreLeft - 1;

        // Index range for starting and ending index of right InOrder
        int siInRight = Isi + count + 1;
        int eiInRight = Iei;

        // Index range for starting and ending index of right PreOrder
        int siPreRight = eiPreLeft + 1;
        int eiPreRight = Pei;

        BinaryTreeNode<Integer> leftNode = buildTree(inOrder, siInleft, eiInleft, preOrder, siPreLeft, eiPreLeft);
        BinaryTreeNode<Integer> rightNode = buildTree(inOrder, siInRight, eiInRight, preOrder, siInRight, eiInRight);
        root.left = leftNode;
        root.right = rightNode;
        return root;


    }
}
