package P628_MaximumProductOfThreeNumbers;

import org.junit.Test;

import java.util.Arrays;

/**
 * Title: Solution1
 * Description:
 * 使用排序，用最小的两个乘积比较第二大和第三大的乘积
 * 但……效率貌似不高，21ms，只超过39.66%
 *
 * 最快的方法，看了Discuss，答案大同小异，就是找到最大的三个数和最小的两个数，用最小两个数的乘积比较第二大和第三大的乘积。
 * 只不过是扫描数组，没有用排序，时间复杂度O(n)
 *
 * @author Lin Hui
 * Created on 2019-1-24 21:44
 */
public class Solution1 {
    @Test
    public void testCase() {
        System.out.println(maximumProduct(new int[]{1, 2, 3}));
        System.out.println(maximumProduct(new int[]{1, 2, 3, 4}));
        System.out.println(maximumProduct(new int[]{2, -3, 4, -5, 6, -7, 8}));
    }

    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        if (nums[0] * nums[1] < nums[n - 3] * nums[n - 2]) {
            return nums[n - 1] * nums[n - 2] * nums[n - 3];
        }
        return nums[0] * nums[1] * nums[n - 1];
    }
}
