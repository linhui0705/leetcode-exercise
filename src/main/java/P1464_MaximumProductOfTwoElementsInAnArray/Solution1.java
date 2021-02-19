package P1464_MaximumProductOfTwoElementsInAnArray;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Title: Solution1
 * Description:
 * 给定一个数组，找出两个不同的元素nums[i]和nums[j]，求(nums[i]-1)*(nums[j]-1)最大值。
 * 题目本质就是取得数组中的最大的两个元素，按照公式套得结果即可。当然，用了排序再拿两个最大元素性能不算快。
 * 看了下题解，最快的方法，还是用两个变量存最大值和第二大的值。
 *
 * @author Lin Hui
 * Created on 2021/2/19 20:49:03
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(12, maxProduct(new int[]{3, 4, 5, 2}));
        Assert.assertEquals(16, maxProduct(new int[]{1, 5, 4, 5}));
        Assert.assertEquals(12, maxProduct(new int[]{3, 7}));
    }

    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }
}
