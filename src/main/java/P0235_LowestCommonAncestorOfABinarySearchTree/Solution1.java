package P0235_LowestCommonAncestorOfABinarySearchTree;

/**
 * Title: Solution1
 * Description:
 * 找二叉搜索树的最小共同祖先
 *
 * @author Lin Hui
 * Created on 2022/2/14 11:35:06
 */
public class Solution1 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode node = root;
        while (null != node) {
            if (node.val > p.val && node.val > q.val) {
                node = node.left;
            } else if (node.val < p.val && node.val < q.val) {
                node = node.right;
            } else {
                return node;
            }
        }
        return root;
    }
}
