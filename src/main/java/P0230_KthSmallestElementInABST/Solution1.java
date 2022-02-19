package P0230_KthSmallestElementInABST;

/**
 * Title: Solution1
 * Description:
 * 给定一个二叉搜索树，找出第k小的元素。
 * 二叉搜索树通过中序遍历，出来的结果是递增有序的。因此通过中序遍历到第k个返回结果即可。
 *
 * @author Lin Hui
 * Created on 2022/2/19 17:44:52
 */
public class Solution1 {
    int count = 0;
    int ans = 0;

    public int kthSmallest(TreeNode root, int k) {
        traverse(root, k);
        return ans;
    }

    private void traverse(TreeNode node, int k) {
        if (null == node || count >= k) {
            return;
        }
        traverse(node.left, k);
        count++;
        if (count == k) {
            ans = node.val;
            return;
        }
        traverse(node.right, k);
    }
}
