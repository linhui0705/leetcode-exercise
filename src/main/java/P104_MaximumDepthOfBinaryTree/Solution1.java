package P104_MaximumDepthOfBinaryTree;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 求二叉树的最大深度
 *
 * @author Lin Hui
 * Created on 2019/2/20 9:34
 */
public class Solution1 {
    int max = Integer.MIN_VALUE;

    @Test
    public void testCase() {

    }

    public int maxDepth(TreeNode root) {
        traversal(root, 1);
        return max;
    }

    public void traversal(TreeNode root, int depth) {
        if (null == root) {
            return;
        }
        max = Math.max(max, depth);
        traversal(root.left, depth + 1);
        traversal(root.right, depth + 1);
    }
}
