package P0938_RangeSumOfBST;

import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 * 解法2，做了优化，剔除了一些不必要遍历的节点。
 *
 * @author Lin Hui
 * Created on 2019-12-26 11:03
 */
public class Solution2 {
    @Test
    public void testCase() {

    }

    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }
        int left = 0;
        int right = 0;
        if (root.val >= L && root.val <= R) {
            left = rangeSumBST(root.left, L, R);
            right = rangeSumBST(root.right, L, R);
        } else if (root.val < L) {
            right = rangeSumBST(root.right, L, R);
        } else if (root.val > R) {
            left = rangeSumBST(root.left, L, R);
        }
        return root.val >= L && root.val <= R ? left + right + root.val : left + right;
    }
}
