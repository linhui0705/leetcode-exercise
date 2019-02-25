package P0001_TwoSum;

import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 * 解法2：暴力，换汤不换药，i!=j放到for循环，稍微快一丢丢
 * Runtime: 36ms
 *
 * @author Lin Hui
 * Created on 2018/6/25 10:34
 */
public class Solution2 {
    @Test
    public void testCase() {
        int[] nums = {3,2,4};
        for (int i : twoSum(nums, 6)) {
            System.out.println(i);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length && i != j; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }
}
