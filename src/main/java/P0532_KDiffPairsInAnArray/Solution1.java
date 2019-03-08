package P0532_KDiffPairsInAnArray;

import org.junit.Test;

import java.util.Arrays;

/**
 * Title: Solution1
 * Description:
 * 题意是：有多少对不重复的绝对值能等于k
 * 排序+O(n²)时间复杂度遍历，效率很低
 *
 * @author Lin Hui
 * Created on 2019-3-8 21:13
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public int findPairs(int[] nums, int k) {
        int ans = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            while (i - 1 >= 0 && i < nums.length && nums[i - 1] == nums[i]) {
                i++;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}
