package Task2;

public class TreeSerializer {
    public static String serialize(TreeNode1 root){
        if (root == null){
            return "NULL";
        }
        String left = serialize(root.left);
        String right = serialize(root.right);
        return "(" + root.val + ", " + left + ", " + right + ")";
    }
}
