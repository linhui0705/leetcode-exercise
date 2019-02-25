package P0414_ThirdMaximumNumber;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Title: Solution1
 * Description:
 * 用了个偷懒的方法，先排序，然后找第三大的数
 * 当然性能不算好……
 *
 * @author Lin Hui
 * Created on 2019-1-20 14:40
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(1, thirdMax(new int[]{3, 2, 1}));
        Assert.assertEquals(2, thirdMax(new int[]{1, 2}));
        Assert.assertEquals(6, thirdMax(new int[]{5, 3, 6, 7, 9, 2, 0, 9, 6}));
    }

    public int thirdMax(int[] nums) {
        Arrays.sort(nums);

        int value = Integer.MAX_VALUE;
        int count = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < value) {
                value = nums[i];
                count++;
            }
            if (count == 3) {
                break;
            }
        }
        return count == 3 ? value : nums[nums.length - 1];
    }
}
