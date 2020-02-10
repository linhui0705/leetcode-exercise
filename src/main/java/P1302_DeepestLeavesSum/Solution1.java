package P1302_DeepestLeavesSum;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 开始刷中等难度的题啰……
 * 二叉树的题目，问的是二叉树中所有最深叶子结点的和
 *
 * @author Lin Hui
 * Created on 2020/2/10 22:01
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    int maxDepth = Integer.MIN_VALUE;
    int ans = 0;

    public int deepestLeavesSum(TreeNode root) {
        traverse(root, 1);
        return ans;
    }

    public void traverse(TreeNode node, int depth) {
        if (null == node) {
            return;
        }
        if (null == node.left && null == node.right) {
            if (depth > maxDepth) {
                maxDepth = depth;
                ans = node.val;
            } else if (depth == maxDepth) {
                ans += node.val;
            }
            return;
        }
        if (null != node.left) {
            traverse(node.left, depth + 1);
        }
        if (null != node.right) {
            traverse(node.right, depth + 1);
        }
    }
}
