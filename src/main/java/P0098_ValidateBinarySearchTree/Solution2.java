package P0098_ValidateBinarySearchTree;

/**
 * Title: Solution2
 * Description:
 *
 * @author Lin Hui
 * Created on 2022/2/21 10:56:06
 */
public class Solution2 {
    public boolean isValidBST(TreeNode root) {
        return traverse(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean traverse(TreeNode node, long min, long max) {
        if (null == node) {
            return true;
        }
        if (min >= node.val || max <= node.val) {
            return false;
        }
        return traverse(node.left, min, node.val) && traverse(node.right, node.val, max);
    }
}
