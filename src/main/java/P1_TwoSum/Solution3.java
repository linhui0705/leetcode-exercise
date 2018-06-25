package P1_TwoSum;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: Solution3
 * Description:
 * 解法3：用HashMap，时间复杂度O(n)
 * Runtime: 10ms
 *
 * @author Lin Hui
 * Created on 2018/6/25 14:01
 */
public class Solution3 {
    @Test
    public void testCase() {
        int[] nums = {3, 2, 4};
        for (int i : twoSum(nums, 6)) {
            System.out.println(i);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }
        return new int[]{0, 0};
    }
}
