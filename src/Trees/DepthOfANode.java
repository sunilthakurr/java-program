package Trees;

import java.util.Scanner;

//Approach :- Here, we simply use recursion and tell our child to display K-1 th node and if k == 0, it will
//            simply display the root data

public class DepthOfANode {
    public static void printAtK(TreeNode<Integer> root, int K) {
        if (K < 0)        // if K is negative it will simply return
            return;
        if (K == 0) {    // if k is zero then it will simply display root data
            System.out.println(root.data);
            return;
        }
        for (int i = 0; i < root.children.size(); ++i) {
            printAtK(root.children.get(i), K - 1);
        }

    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Kth node whose all value you want to display");
        int K = obj.nextInt();
        TreeNode<Integer> root = takeInputLL.takeInputLevelWise();
        printAtK(root, K);
    }
}
