package Task1;

import com.sun.source.tree.Tree;

public class TreeHeightMain {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        findHeight(root);
        System.out.println("Высота корня (1): " + root.height);
        System.out.println("Высота узла 2: " + root.left.height);
        System.out.println("Высота узла 3: " + root.right.height);
        System.out.println("Высота узла 4: " + root.left.left.height);
        System.out.println("Высота узла 5: " + root.left.right.height);
        System.out.println("Высота узла 6: " + root.right.right.height);

    }

    public static void findHeight(TreeNode node){
        findHeightRecursive(node);
    }

    private static int findHeightRecursive(TreeNode node){
        if (node == null){
            return 0;
        }
        int leftHeight = findHeightRecursive(node.left);
        int rightHeight = findHeightRecursive(node.right);
        node.height = Math.max(leftHeight, rightHeight) + 1;
        return node.height;

    }
}
