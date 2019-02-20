package P965_UnivaluedBinaryTree;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 判断二叉树每个结点的值是否相同。水题。
 *
 * @author Lin Hui
 * Created on 2019-2-19 20:55
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public boolean isUnivalTree(TreeNode root) {
        return traversal(root, root.val);
    }

    public boolean traversal(TreeNode root, int val) {
        if (root == null) {
            return true;
        }
        if (root.val != val) {
            return false;
        }
        boolean lResult = traversal(root.left, val);
        boolean rResult = traversal(root.right, val);
        return lResult && rResult;
    }
}
