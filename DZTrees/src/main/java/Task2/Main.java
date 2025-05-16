package Task2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        TreeNode1 root = new TreeNode1(1);
        root.left = new TreeNode1(2);
        root.right = new TreeNode1(3);
        root.right.left = new TreeNode1(4);
        String serialized = TreeSerializer.serialize(root);

        System.out.println(serialized);
    }
}
