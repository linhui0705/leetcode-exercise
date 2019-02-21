package P112_PathSum;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一棵二叉树和一个值sum，从根结点到叶子结点的路径遍历，判断是否存在路径结点的和等于给定值sum
 *
 * @author Lin Hui
 * Created on 2019/2/21 17:10
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if (null == root) {
            return false;
        }
        if (null == root.left && null == root.right) {
            if (sum == root.val) {
                return true;
            } else {
                return false;
            }
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
