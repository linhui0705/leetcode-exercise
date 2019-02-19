package P226_InvertBinaryTree;

import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 *
 * @author Lin Hui
 * Created on 2019-2-19 22:16
 */
public class Solution2 {
    @Test
    public void testCase() {

    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.right);
        root.left = invertTree(root.right);
        root.right = left;
        return root;
    }
}