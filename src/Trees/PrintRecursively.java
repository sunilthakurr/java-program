package Trees;

public class PrintRecursively {
    public static void print(TreeNode<Integer> root) {
        String s = root.data + " : ";
        for (int i = 0; i < root.children.size(); ++i) {
            s = s + root.children.get(i).data + " , ";

        }
        System.out.println(s);
        for (int i = 0; i < root.children.size(); ++i) {
            print(root.children.get(i));
        }
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = UpdatedTreeUse.takeInput();
        print(root);
    }
}
