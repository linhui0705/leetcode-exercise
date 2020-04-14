package P0543_DiameterOfBinaryTree;

/**
 * Title: Solution1
 * Description:
 * 求二叉树的直径
 * 分别递归算出左右子树的深度，不断更新当前树的最大直径
 *
 * @author Lin Hui
 * Created on 2020/4/14 11:30:32
 */
public class Solution1 {
    int ans;

    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        depth(root);
        return ans - 1;
    }

    int depth(TreeNode node) {
        if (null == node) {
            return 0;
        }
        int l = depth(node.left);
        int r = depth(node.right);
        ans = Math.max(ans, l + r + 1);
        return Math.max(l, r) + 1;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
