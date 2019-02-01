package P506_RelativeRanks;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Title: Solution1
 * Description:
 * 使用Map存储分数对应的顺序索引，然后对分数排序，从高到低分配名次
 *
 * @author Lin Hui
 * Created on 2019-1-31 22:45
 */
public class Solution1 {
    @Test
    public void testCase() {
        String[] result1 = findRelativeRanks(new int[]{5, 4, 3, 2, 1});
        String[] result2 = findRelativeRanks(new int[]{8, 2, 10, 6, 9});
    }

    public String[] findRelativeRanks(int[] nums) {
        String[] result = new String[nums.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        Arrays.sort(nums);
        int count = 3;
        for (int i = nums.length - 1; i >= 0; i--) {
            int index = map.get(nums[i]);
            if (i == nums.length - 1) {
                result[index] = "Gold Medal";
            } else if (i == nums.length - 2) {
                result[index] = "Silver Medal";
            } else if (i == nums.length - 3) {
                result[index] = "Bronze Medal";
            } else {
                result[index] = String.valueOf(++count);
            }
        }
        return result;
    }
}
