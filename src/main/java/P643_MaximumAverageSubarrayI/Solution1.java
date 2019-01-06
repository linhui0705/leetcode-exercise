package P643_MaximumAverageSubarrayI;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * O(n)
 *
 * @author Lin Hui
 * Created on 2019-1-6 20:02
 */
public class Solution1 {
    @Test
    public void testCase() {
        int[] nums1 = new int[]{1, 12, -5, -6, 50, 3};
        System.out.println(findMaxAverage(nums1, 4));
    }

    public double findMaxAverage(int[] nums, int k) {
        double total = 0;
        for (int i = 0; i < k; i++) {
            total += nums[i];
        }
        double max = total;
        for (int i = k, j = 0; i < nums.length; i++, j++) {
            total += nums[i] - nums[j];
            if (max < total) {
                max = total;
            }
        }
        return max / k;
    }
}
