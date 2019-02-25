package P0590_NAryTreePostorderTraversal;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 * N叉树的后序遍历
 * 按照“先子结点左右到根结点”的顺序进行遍历。
 * 参考589题，换汤不换药。
 *
 * @author Lin Hui
 * Created on 2019-2-19 21:16
 */
public class Solution1 {
    List<Integer> ans = new ArrayList<>();

    @Test
    public void testCase() {

    }

    public List<Integer> postorder(Node root) {
        traversal(root);
        return ans;
    }

    public void traversal(Node root) {
        if (root == null) {
            return;
        }
        for (Node node : root.children) {
            traversal(node);
        }
        ans.add(root.val);
    }
}
