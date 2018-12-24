package P001_TwoSum;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 解法1：暴力，显然效率不高
 * Runtime: 155ms
 *
 * @author Lin Hui
 * Created on 2018/6/25 10:13
 */
public class Solution1 {
    @Test
    public void testCase() {
        int[] nums = {2, 7, 11, 15};
        for (int i : twoSum(nums, 9)) {
            System.out.println(i);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }
}
