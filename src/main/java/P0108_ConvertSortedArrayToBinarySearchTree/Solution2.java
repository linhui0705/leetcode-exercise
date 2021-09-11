package P0108_ConvertSortedArrayToBinarySearchTree;

import java.util.Arrays;

/**
 * Title: Solution2
 * Description:
 * 给定一个数组，将这个数组转化为一棵平衡二叉树。
 * 这次不依赖Arrays.copyOfRange方法。
 * Result: Runtime: 1 ms, faster than 9.13%; Memory Usage: 40.5 MB, less than 12.24%
 *
 * @author Lin Hui
 * Created on 2021/9/11 16:35:24
 */
public class Solution2 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return convert(nums, 0, nums.length - 1);
    }

    public TreeNode convert(int[] nums, int i, int j) {
        if (i > j) {
            return null;
        }
        int mid = (i + j) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = convert(nums, i, mid - 1);
        node.right = convert(nums, mid + 1, j);
        return node;
    }
}
