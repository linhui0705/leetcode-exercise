package P0701_InsertIntoABinarySearchTree;

/**
 * Title: Solution1
 * Description:
 * 给定一棵二叉搜索树和值val，现需将值val插入到这棵树，且插入后以及保持是二叉搜索树。
 * 按照二分查找的思路，找到空的分支插入即可。
 *
 * @author Lin Hui
 * Created on 2022/2/21 12:17:15
 */
public class Solution1 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return insertNode(root, val);
        // return root;
    }

    private TreeNode insertNode(TreeNode node, int val) {
        if (null == node) {
            node = new TreeNode(val);
            return node;
        }
        if (node.val > val) {
            if (null == node.left) {
                node.left = new TreeNode(val);
                return node;
            } else {
                insertNode(node.left, val);
            }
        } else {
            if (null == node.right) {
                node.right = new TreeNode(val);
                return node;
            } else {
                insertNode(node.right, val);
            }
        }
        return node;
    }
}
