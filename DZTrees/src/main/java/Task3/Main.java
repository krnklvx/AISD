package Task3;

import static Task3.NTreeSerializer.serialize;

public class Main {
    public static void main(String[] args) {
        NTreeNode root = new NTreeNode(1);
        NTreeNode node2 = new NTreeNode(2);
        NTreeNode node3 = new NTreeNode(3);
        NTreeNode node4 = new NTreeNode(4);
        NTreeNode node5 = new NTreeNode(5);
        NTreeNode node6 = new NTreeNode(6);
        NTreeNode node7 = new NTreeNode(7);

        root.descendants.add(node2);
        root.descendants.add(node3);
        root.descendants.add(node4);

        node2.descendants.add(node5);
        node2.descendants.add(node6);

        node4.descendants.add(node7);

        System.out.println(serialize(root));
    }
}
