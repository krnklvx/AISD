package Task3;

import java.util.ArrayList;
import java.util.List;

public class NTreeNode {
    List<NTreeNode> descendants;
    int val;

    public NTreeNode(int val) {
        descendants = new ArrayList<>();
        this.val = val;
    }
}
