package P590_NAryTreePostorderTraversal;

import java.util.List;

/**
 * Title: Node
 * Description:
 *
 * @author Lin Hui
 * Created on 2019-2-19 21:12
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}