package P0226_InvertBinaryTree;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 二叉树子结点翻转
 *
 * @author Lin Hui
 * Created on 2019-2-19 22:11
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public TreeNode invertTree(TreeNode root) {
        traversal(root);
        return root;
    }

    public void traversal(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        traversal(root.left);
        traversal(root.right);
    }
}
