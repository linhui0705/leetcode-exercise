package P993_CousinsInBinaryTree;

/**
 * Title: Solution1
 * Description:
 * Weekly Contest 124 题目
 * 由于之前搁置树的题目，今天碰到也是有些懵逼了
 * 想着尽快解决问题，也就不考虑性能了……WA两次才AC
 * 题意是判断两个结点是不是表亲结点（两结点层级相同但父级结点非同一结点）
 *
 * @author Lin Hui
 * Created on 2019-2-17 12:10
 */
public class Solution1 {
    public boolean isCousins(TreeNode root, int x, int y) {
        int a = getDepth(root, 1, x, x, y);
        int b = getDepth(root, 1, y, x, y);
        return a == b && (a != -1 && b != -1);
    }

    public int getDepth(TreeNode root, int depth, int val, int x, int y) {
        if (root.val == val) {
            return depth;
        }
        if (root.left == null && root.right == null) {
            return -1;
        }
        if (root.left != null && root.right != null) {
            if ((root.left.val == x && root.right.val == y) || (root.left.val == y && root.right.val == x)) {
                return -1;
            }
            return Math.max(getDepth(root.left, depth + 1, val, x, y), getDepth(root.right, depth + 1, val, x, y));
        }
        if (root.left != null) {
            return getDepth(root.left, depth + 1, val, x, y);
        }
        if (root.right != null) {
            return getDepth(root.right, depth + 1, val, x, y);
        }
        return -1;
    }

}