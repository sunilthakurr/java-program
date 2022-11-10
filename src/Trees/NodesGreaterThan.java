package Trees;

import java.util.Scanner;

public class NodesGreaterThan {
    public static int NoOfNodesGreater(TreeNode<Integer> root, int x) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        if (root.data > x) {
            count = 1;
        }
        for (int i = 0; i < root.children.size(); ++i) {
            count += NoOfNodesGreater(root.children.get(i), x);
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number by which you want comparison : ");
        int x = obj.nextInt();
        TreeNode<Integer> root = takeInputLL.takeInputLevelWise();
        System.out.println(NoOfNodesGreater(root, x));
    }
}
