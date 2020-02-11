package P1315_SumOfNodesWithEvenValuedGrandparent;

/**
 * Title: Solution1
 * Description:
 * 给定一棵二叉树，对爷爷结点值为偶数的所有孙子结点进行累加，返回它们的和
 * 用个笨方法，直接硬撸，1ms
 *
 * @author Lin Hui
 * Created on 2020/2/11 11:35
 */
public class Solution1 {
    int ans = 0;

    public int sumEvenGrandparent(TreeNode root) {
        traverse(root);
        return ans;
    }

    public void traverse(TreeNode node) {
        if (null == node) {
            return;
        }
        if ((node.val & 1) == 0) {
            if (null != node.left) {
                if (null != node.left.left) {
                    ans += node.left.left.val;
                }
                if (null != node.left.right) {
                    ans += node.left.right.val;
                }
            }
            if (null != node.right) {
                if (null != node.right.left) {
                    ans += node.right.left.val;
                }
                if (null != node.right.right) {
                    ans += node.right.right.val;
                }
            }
        }
        traverse(node.left);
        traverse(node.right);
    }
}
