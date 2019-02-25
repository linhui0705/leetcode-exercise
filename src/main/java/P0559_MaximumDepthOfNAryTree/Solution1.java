package P0559_MaximumDepthOfNAryTree;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给出一棵N叉树，计算树的最大深度。水题。
 *
 * @author Lin Hui
 * Created on 2019-2-19 21:30
 */
public class Solution1 {
    int max = 0;

    @Test
    public void testCase() {

    }

    public int maxDepth(Node root) {
        traversal(root, 1);
        return max;
    }

    public void traversal(Node root, int depth) {
        if (root == null) {
            return;
        }
        if (root.children != null && root.children.size() > 0) {
            for (Node node : root.children) {
                traversal(node, depth + 1);
            }
        }
        max = Math.max(max, depth);
    }

}
