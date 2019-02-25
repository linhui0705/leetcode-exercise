package P0747_LargestNumberAtLeastTwiceOfOthers;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 * 小改6ms的参考答案，但实际效果貌似也没那么快。即使把参考答案粘贴提交，也只是17ms
 *
 * @author Lin Hui
 * Created on 2019-1-6 16:50
 */
public class Solution2 {
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
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[index]) {
                index = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == index) {
                continue;
            }
            if (nums[i] > nums[index] >> 1) {
                return -1;
            }
        }

        return index;
    }
}
