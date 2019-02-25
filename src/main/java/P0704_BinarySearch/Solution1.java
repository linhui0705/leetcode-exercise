package P0704_BinarySearch;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 二分查找
 * 使用递归查找
 *
 * @author Lin Hui
 * Created on 2019/2/1 9:23
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(4, search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        Assert.assertEquals(-1, search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
        Assert.assertEquals(0, search(new int[]{5}, 5));
    }

    public int search(int[] nums, int target) {
        return binarySearch(0, nums.length - 1, nums, target);
    }

    public int binarySearch(int start, int end, int[] nums, int target) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        int k = nums[mid];
        if (k == target) {
            return mid;
        } else if (k > target) {
            return binarySearch(start, mid - 1, nums, target);
        } else {
            return binarySearch(mid + 1, end, nums, target);
        }
    }
}
