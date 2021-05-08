package P0525_ContiguousArray;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: Solution1
 * Description:
 * 0和1数量相同的情况下，求最大的子数组长度
 *
 * @author Lin Hui
 * Created on 2020/4/14 15:21:03
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(2, findMaxLength(new int[]{0, 1}));
        Assert.assertEquals(10, findMaxLength(new int[]{1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0}));
        //1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0
        //1, 2, 3, 2, 3, 2, 3, 2, 1, 0,-1,-2,-3
    }

    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxLen = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(count)) {
                maxLen = Math.max(maxLen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxLen;
    }
}
