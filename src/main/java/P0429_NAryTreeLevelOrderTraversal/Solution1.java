package P0429_NAryTreeLevelOrderTraversal;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 * 遍历N叉树，按照层级顺序，输出层级结点List
 *
 * @author Lin Hui
 * Created on 2019/2/22 17:24
 */
public class Solution1 {
    List<List<Integer>> ans = new ArrayList<>();

    @Test
    public void testCase() {

    }

    public List<List<Integer>> levelOrder(Node root) {
        traversal(root, 0);
        return ans;
    }

    public void traversal(Node root, int depth) {
        if (null == root) {
            return;
        }
        List<Integer> list = null;
        if (ans.size() <= depth) {
            list = new ArrayList<>();
            ans.add(list);
        } else {
            list = ans.get(depth);
        }
        list.add(root.val);
        for (Node node : root.children) {
            traversal(node, depth + 1);
        }
    }
}
