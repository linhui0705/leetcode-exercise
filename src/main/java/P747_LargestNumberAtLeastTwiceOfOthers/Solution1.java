package P747_LargestNumberAtLeastTwiceOfOthers;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 找最大数和第二大的数
 *
 * @author Lin Hui
 * Created on 2019-1-6 16:17
 */
public class Solution1 {
    @Test
    public void testCase() {
        int[] nums1 = new int[]{3, 6, 1, 0};
        Assert.assertEquals(1, dominantIndex(nums1));

        int[] nums2 = new int[]{1, 2, 3, 4};
        Assert.assertEquals(-1, dominantIndex(nums2));

        int[] nums3 = new int[]{1};
        Assert.assertEquals(0, dominantIndex(nums3));

        int[] nums4 = new int[]{1, 0};
        Assert.assertEquals(0, dominantIndex(nums4));

        int[] nums5 = new int[]{0, 0, 3, 2};
        Assert.assertEquals(-1, dominantIndex(nums5));
    }

    public int dominantIndex(int[] nums) {
        int firstIndex = -1;
        int secondIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (firstIndex == -1 || nums[firstIndex] <= nums[i]) {
                secondIndex = firstIndex;
                firstIndex = i;
            } else if (secondIndex == -1 || nums[secondIndex] <= nums[i]) {
                secondIndex = i;
            }
        }
        if (nums.length == 1 || nums[firstIndex] >= nums[secondIndex] << 1) {
            return firstIndex;
        } else {
            return -1;
        }
    }
}
