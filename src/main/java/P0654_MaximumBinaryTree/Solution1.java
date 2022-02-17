package P0654_MaximumBinaryTree;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 最大二叉树。
 * 给定一个不重复的整数数组 nums 。 最大二叉树 可以用下面的算法从 nums 递归地构建:
 * 创建一个根节点，其值为 nums 中的最大值。
 * 递归地在最大值 左边 的 子数组前缀上 构建左子树。
 * 递归地在最大值 右边 的 子数组后缀上 构建右子树。
 * 返回 nums 构建的 最大二叉树 。
 *
 * @author Lin Hui
 * Created on 2022/2/17 10:55:06
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int index = maxIndex(nums, 0, nums.length - 1);
        return build(nums, index, 0, nums.length - 1);
    }

    private int maxIndex(int[] nums, int begin, int end) {
        if (begin > end) {
            return -1;
        }
        int maxIndex = begin;
        for (int i = begin + 1; i <= end; i++) {
            if (nums[maxIndex] < nums[i]) {
                maxIndex = i;
            }
        }
        // System.out.println("begin=" + begin + ", end=" + end + ", index=" + maxIndex);
        return maxIndex;
    }

    private TreeNode build(int[] nums, int index, int l, int r) {
        TreeNode node = new TreeNode(nums[index]);
        int leftIndex = maxIndex(nums, l, index - 1);
        if (leftIndex == -1) {
            node.left = null;
        } else {
            node.left = build(nums, leftIndex, l, index - 1);
        }
        int rightIndex = maxIndex(nums, index + 1, r);
        if (rightIndex == -1) {
            node.right = null;
        } else {
            node.right = build(nums, rightIndex, index + 1, r);
        }
        return node;
    }
}
