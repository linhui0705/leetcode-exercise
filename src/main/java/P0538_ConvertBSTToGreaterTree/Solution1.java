package P0538_ConvertBSTToGreaterTree;

/**
 * Title: Solution1
 * Description:
 * 给定一个二叉搜索树，将这个树转换为累积树，使每个节点 node 的新值等于原树中大于或等于 node.val 的值之和。
 * 题目与1038相同。
 *
 * @author Lin Hui
 * Created on 2022/2/19 23:55:06
 */
public class Solution1 {
    int sum;

    public TreeNode convertBST(TreeNode root) {
        sum = 0;
        traverse(root);
        return root;
    }

    private void traverse(TreeNode node) {
        if (null == node) {
            return;
        }
        traverse(node.right);
        node.val += sum;
        sum = node.val;
        traverse(node.left);
    }
}
