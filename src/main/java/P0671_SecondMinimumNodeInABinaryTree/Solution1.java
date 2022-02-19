package P0671_SecondMinimumNodeInABinaryTree;

/**
 * Title: Solution1
 * Description:
 * 给定一个非空特殊的二叉树，每个节点都是正数，并且每个节点的子节点数量只能为2或0。
 * 且父子节点间满足root.val = min(root.left.val, root.right.val)。
 * 找出第二小的节点值。若没有，返回-1。
 * 题目看似是二叉树，但本质是深度遍历。主要需要注意边界情况。如输入用例：[2,2,2147483647]
 *
 * @author Lin Hui
 * Created on 2022/2/19 22:35:24
 */
public class Solution1 {
    int min;
    long ans = Long.MAX_VALUE;

    public int findSecondMinimumValue(TreeNode root) {
        min = root.val;
        traverse(root);
        return (ans < Long.MAX_VALUE) ? (int) ans : -1;
    }

    public void traverse(TreeNode node) {
        if (null == node) {
            return;
        }
        if (min < node.val && node.val < ans) {
            ans = node.val;
        } else if (min == node.val) {
            traverse(node.left);
            traverse(node.right);
        }
    }
}
