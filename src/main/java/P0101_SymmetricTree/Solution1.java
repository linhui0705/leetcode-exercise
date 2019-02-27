package P0101_SymmetricTree;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给出一棵二叉树，判断其是否对称
 * 题解：递归解法
 *
 * @author Lin Hui
 * Created on 2019/2/27 14:36
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    public boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        return (t1.val == t2.val) && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }
}
