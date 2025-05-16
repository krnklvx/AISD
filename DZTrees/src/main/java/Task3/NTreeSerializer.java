package Task3;

public class NTreeSerializer {
    public static String serialize(NTreeNode root){
        if (root.descendants.isEmpty()){
            return "(" + root.val + ", NULL)";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("(").append(root.val).append(", ");

        for (int i = 0; i < root.descendants.size(); i++){
            sb.append(serialize(root.descendants.get(i)));
            if (i < root.descendants.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
