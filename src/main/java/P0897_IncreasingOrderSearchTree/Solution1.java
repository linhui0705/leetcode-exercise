package P0897_IncreasingOrderSearchTree;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 将题目所给的树进行中序遍历，输出一棵只有右结点的树。
 *
 * @author Lin Hui
 * Created on 2019-2-19 21:57
 */
public class Solution1 {
    TreeNode tree;
    TreeNode p;

    @Test
    public void testCase() {

    }

    public TreeNode increasingBST(TreeNode root) {
        traversal(root);
        return tree;
    }

    public void traversal(TreeNode root) {
        if (root == null) {
            return;
        }
        traversal(root.left);
        if (tree == null) {
            tree = new TreeNode(root.val);
            p = tree;
        } else {
            p.right = new TreeNode(root.val);
            p = p.right;
        }
        traversal(root.right);
    }
}
