package P0404_SumOfLeftLeaves;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 计算二叉树所有左叶子结点的总和
 *
 * @author Lin Hui
 * Created on 2019-2-19 23:05
 */
public class Solution1 {
    int ans = 0;

    @Test
    public void testCase() {

    }

    public int sumOfLeftLeaves(TreeNode root) {
        traversal(root, false);
        return ans;
    }

    public void traversal(TreeNode root, boolean isLeft) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null && isLeft) {
            ans += root.val;
        }
        if (root.left != null) {
            traversal(root.left, true);
        }
        if (root.right != null) {
            traversal(root.right, false);
        }
    }
}
