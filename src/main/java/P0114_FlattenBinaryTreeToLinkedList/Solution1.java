package P0114_FlattenBinaryTreeToLinkedList;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一个二叉树，将这个二叉树展开成链表，左子树为null，右子树为链表的下一个节点。
 *
 * @author Lin Hui
 * Created on 2022/2/16 22:55:32
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public void flatten(TreeNode root) {
        if (null == root) {
            return;
        }
        flatten(root.left);
        flatten(root.right);

        TreeNode tmp = root.right;
        root.right = root.left;
        TreeNode p = root;
        root.left = null;

        while (null != p.right) {
            p = p.right;
        }
        p.right = tmp;
    }
}
