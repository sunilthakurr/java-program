package Trees;

import java.util.Scanner;

public class checkIfContainsX {
    public static boolean isPresent(TreeNode<Integer> root, int x) {

        if (root == null)
            return false;
        if (root.data == x)
            return true;
        boolean flag = false;
        for (int i = 0; i < root.children.size(); ++i) {
            flag = isPresent(root.children.get(i), x);
            if (flag)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int x = obj.nextInt();
        TreeNode<Integer> root = takeInputLL.takeInputLevelWise();
        System.out.println(isPresent(root, x));
    }
}
