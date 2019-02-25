package P0111_MinimumDepthOfBinaryTree;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 求二叉树的遍历至叶子节点的最小深度。水题。
 *
 * @author Lin Hui
 * Created on 2019/2/20 9:42
 */
public class Solution1 {
    int min = Integer.MAX_VALUE;

    @Test
    public void testCase() {

    }

    public int minDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }
        traversal(root, 1);
        return min;
    }

    public void traversal(TreeNode root, int depth) {
        if (null == root) {
            return;
        }
        traversal(root.left, depth + 1);
        traversal(root.right, depth + 1);
        if (null == root.left && null == root.right) {
            min = Math.min(min, depth);
        }
    }
}
