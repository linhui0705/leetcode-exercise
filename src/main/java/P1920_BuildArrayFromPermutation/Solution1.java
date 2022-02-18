package P1920_BuildArrayFromPermutation;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一个数组nums，数组元素0 <= nums[i] < nums.length且各元素互不相同。
 * 现需构建数组ans，使得ans[i] = nums[nums[i]]。
 *
 * @author Lin Hui
 * Created on 2022/2/18 10:19:39
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertArrayEquals(new int[]{0, 1, 2, 4, 5, 3}, buildArray(new int[]{0, 2, 1, 5, 3, 4}));
        Assert.assertArrayEquals(new int[]{4, 5, 0, 1, 2, 3}, buildArray(new int[]{5, 0, 1, 2, 3, 4}));
        Assert.assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5}, buildArray(new int[]{5, 4, 3, 2, 1, 0}));
        Assert.assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5}, buildArray(new int[]{0, 1, 2, 3, 4, 5}));
        Assert.assertArrayEquals(new int[]{0, 4, 3, 2, 1, 5}, buildArray(new int[]{0, 2, 4, 1, 3, 5}));
    }

    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
