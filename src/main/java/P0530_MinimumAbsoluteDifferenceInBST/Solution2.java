package P0530_MinimumAbsoluteDifferenceInBST;

import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 * 二叉排序数的中序遍历，本质就是二叉树的所有节点从小到大的排序。
 *
 * @author Lin Hui
 * Created on 2020-1-14 10:54
 */
public class Solution2 {
    int min = Integer.MAX_VALUE;
    TreeNode prev = null;

    @Test
    public void testCase() {

    }

    public int getMinimumDifference(TreeNode root) {
        inOrderTraversal(root);
        return min;
    }

    void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        inOrderTraversal(root.left);
        if (prev != null) {
            min = Math.min(min, root.val - prev.val);
        }
        // reset previous
        prev = root;
        inOrderTraversal(root.right);
    }
}
