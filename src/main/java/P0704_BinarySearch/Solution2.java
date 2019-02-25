package P0704_BinarySearch;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 * 迭代
 *
 * @author Lin Hui
 * Created on 2019/2/1 9:41
 */
public class Solution2 {
    @Test
    public void testCase() {
        Assert.assertEquals(4, search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        Assert.assertEquals(-1, search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
        Assert.assertEquals(0, search(new int[]{5}, 5));
    }

    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            int k = nums[mid];
            if (k == target) {
                return mid;
            } else if (k > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return -1;
    }
}
