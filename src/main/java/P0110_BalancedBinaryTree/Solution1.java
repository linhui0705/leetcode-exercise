package P0110_BalancedBinaryTree;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一棵二叉树，判断该二叉树是否为平衡二叉树
 * 平衡二叉树性质：它是一棵空树或它的左右两个子树的高度差的绝对值不超过1，并且左右两个子树都是一棵平衡二叉树。
 *
 * @author Lin Hui
 * Created on 2020-1-17 11:42
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (Math.abs(diff(root)) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int diff(TreeNode node) {
        return height(node.left) - height(node.right);
    }

    public int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(height(node.left), height(node.right)) + 1;
    }

}
