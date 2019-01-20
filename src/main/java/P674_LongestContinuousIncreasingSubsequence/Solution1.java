package P674_LongestContinuousIncreasingSubsequence;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2019-1-20 16:11
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(3, findLengthOfLCIS(new int[]{1, 3, 5, 4, 7}));
        Assert.assertEquals(1, findLengthOfLCIS(new int[]{2, 2, 2, 2, 2}));
        Assert.assertEquals(4, findLengthOfLCIS(new int[]{1, 3, 5, 7}));
        Assert.assertEquals(4, findLengthOfLCIS(new int[]{1, 3, 5, 4, 2, 3, 4, 5}));

    }

    public int findLengthOfLCIS(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        int max = 0;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                count++;
            } else {
                max = max < count ? count : max;
                count = 1;
            }
        }
        return max < count ? count : max;
    }
}
