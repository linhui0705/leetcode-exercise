package P100_SameTree;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 判断两棵二叉树是否为同一棵树
 * 通过先序遍历进行判断
 *
 * @author Lin Hui
 * Created on 2019/2/19 17:29
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if ((p != null && q == null) || (p == null && q != null) || p.val != q.val) {
            return false;
        }
        boolean pResult = isSameTree(p.left, q.left);
        if (!pResult) {
            return false;
        }
        boolean qResult = isSameTree(p.right, q.right);
        return pResult && qResult;
    }
}
