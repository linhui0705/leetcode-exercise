package P0108_ConvertSortedArrayToBinarySearchTree;

import java.util.Arrays;

/**
 * Title: Solution1
 * Description:
 * 给定一个数组，将这个数组转化为一棵平衡二叉树。
 *
 * @author Lin Hui
 * Created on 2021/9/11 16:35:24
 */
public class Solution1 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (null == nums || nums.length == 0) {
            return null;
        }
        int mid = (nums.length - 1) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
        node.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid + 1, nums.length));
        return node;
    }
}
