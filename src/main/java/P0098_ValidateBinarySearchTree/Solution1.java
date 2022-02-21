package P0098_ValidateBinarySearchTree;

/**
 * Title: Solution1
 * Description:
 * 给定一颗二叉树，验证这棵树是否为二叉搜索树。
 * 可以利用二叉搜索树中序遍历自增的性质来求解。
 *
 * @author Lin Hui
 * Created on 2022/2/21 10:09:47
 */
public class Solution1 {
    Integer num = null;
    boolean result = true;

    public boolean isValidBST(TreeNode root) {
        traverse(root);
        // System.out.println();
        return result;
    }

    private void traverse(TreeNode node) {
        if (null == node || result == false) {
            return;
        }
        traverse(node.left);
        if (null == num) {
            num = node.val;
        } else {
            if (num >= node.val) {
                result = false;
                return;
            } else {
                num = node.val;
            }
        }
        // System.out.println(node.val);
        traverse(node.right);
    }
}
