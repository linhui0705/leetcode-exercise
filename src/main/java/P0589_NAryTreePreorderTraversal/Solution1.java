package P0589_NAryTreePreorderTraversal;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 * N叉树的先序遍历
 * 按照“根-左-右”的顺序进行遍历。
 *
 * @author Lin Hui
 * Created on 2019-2-19 21:11
 */
public class Solution1 {
    List<Integer> ans = new ArrayList<>();

    @Test
    public void testCase() {

    }

    public List<Integer> preorder(Node root) {
        traversal(root);
        return ans;
    }

    public void traversal(Node root) {
        if (root == null) {
            return;
        }
        ans.add(root.val);
        for (Node node : root.children) {
            traversal(node);
        }
    }
}
