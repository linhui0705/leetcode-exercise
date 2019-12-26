package P0938_RangeSumOfBST;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定左右范围，遍历二叉树算出在这个范围内的节点的和
 * 解法1遍历了所有的节点，有些不必要的节点也遍历了
 *
 * @author Lin Hui
 * Created on 2019-12-26 10:52
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }
        int left = rangeSumBST(root.left, L, R);
        int right = rangeSumBST(root.right, L, R);
        return root.val >= L && root.val <= R ? left + right + root.val : left + right;
    }
}
