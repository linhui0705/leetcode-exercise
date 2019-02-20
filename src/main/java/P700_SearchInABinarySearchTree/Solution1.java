package P700_SearchInABinarySearchTree;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 二叉搜索树
 * 找对应值的结点，返回其子树。水题。
 *
 * @author Lin Hui
 * Created on 2019-2-19 20:43
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        } else if (root.val > val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }
}
