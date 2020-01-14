package P0783_MinimumDistanceBetweenBSTNodes;

/**
 * Title: Solution1
 * Description:
 * 题目与530. Minimum Absolute Difference in BST没有区别
 *
 * @author Lin Hui
 * Created on 2020-1-14 15:04
 */
public class Solution1 {
    int min = Integer.MAX_VALUE;
    TreeNode prev = null;

    public int minDiffInBST(TreeNode root) {
        inOrderTraversal(root);
        return min;
    }

    public void inOrderTraversal(TreeNode root) {
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
