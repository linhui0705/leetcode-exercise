package P0724_FindPivotIndex;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 32ms，超过15.27%，慢！思路也不清晰！不易理解！
 *
 * @author Lin Hui
 * Created on 2019-1-27 23:16
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(3, pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
        Assert.assertEquals(-1, pivotIndex(new int[]{1, 2, 3}));
        Assert.assertEquals(3, pivotIndex(new int[]{1, 5, 9, 6, 2, 5, 8}));
        Assert.assertEquals(2, pivotIndex(new int[]{1, 9, 8, 2, 2, 3, 1, 2}));
        Assert.assertEquals(2, pivotIndex(new int[]{-1, -1, -1, -1, -1, 0}));
        Assert.assertEquals(5, pivotIndex(new int[]{1, 1, 0, -1, -1, -1}));
        Assert.assertEquals(0, pivotIndex(new int[]{-1, -1, -1, 0, 1, 1}));
    }

    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (left == total - nums[i]) {
                return i;
            } else {
                left += nums[i];
                total -= nums[i];
            }
        }
        return -1;
    }
}
