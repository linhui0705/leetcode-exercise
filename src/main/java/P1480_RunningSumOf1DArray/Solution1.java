package P1480_RunningSumOf1DArray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一个数组，返回一个runningSum的数组。其中，runningSum[i] = sum(nums[0]...nums[i])
 * 水题，很容易理解，第i项的runningSum等于nums第0项到第i项的和。
 *
 * @author Lin Hui
 * Created on 2021/2/10 09:44:25
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertArrayEquals(new int[]{1, 3, 6, 10}, runningSum(new int[]{1, 2, 3, 4}));
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, runningSum(new int[]{1, 1, 1, 1, 1}));
        Assert.assertArrayEquals(new int[]{3, 4, 6, 16, 17}, runningSum(new int[]{3, 1, 2, 10, 1}));
        Assert.assertArrayEquals(new int[]{}, runningSum(new int[]{}));
        Assert.assertArrayEquals(new int[]{1}, runningSum(new int[]{1}));
    }

    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        if (nums.length == 0) {
            return arr;
        }
        arr[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            arr[i] = arr[i - 1] + nums[i];
        }
        return arr;
    }
}
