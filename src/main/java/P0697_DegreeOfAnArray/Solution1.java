package P0697_DegreeOfAnArray;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Title: Solution1
 * Description:
 * 数组的度：数组内出现最多次数的元素
 * 题目大意：找到nums拥有相同大小的度的最短连续子数组，返回其长度
 * 不喜欢这个题，很拗口，题目也挺费解……
 *
 * 这个题目，主要需要记录数组的出现次数，以找到数组的度，其次记录元素左右索引。
 *
 * @author Lin Hui
 * Created on 2019/3/15 15:34
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(2, findShortestSubArray(new int[]{1, 2, 2, 3, 1}));
        Assert.assertEquals(6, findShortestSubArray(new int[]{1, 2, 2, 3, 1, 4, 2}));
    }

    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
            left.putIfAbsent(nums[i], i);
            right.put(nums[i], i);
        }
        int ans = nums.length;
        int degree = Collections.max(count.values());
        for (int x : count.keySet()) {
            if (degree == count.get(x)) {
                ans = Math.min(ans, right.get(x) - left.get(x) + 1);
            }
        }
        return ans;
    }
}
