package P0094_BinaryTreeInorderTraversal;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树中序遍历
 * 水题
 *
 * @author Lin Hui
 * @date 2021/9/7 17:39
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public List<Integer> ans = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        this.traversal(root);
        return ans;
    }

    public void traversal(TreeNode node) {
        if (null == node) {
            return;
        }
        this.traversal(node.left);
        ans.add(node.val);
        this.traversal(node.right);
    }
}
