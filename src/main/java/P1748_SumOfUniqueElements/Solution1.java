package P1748_SumOfUniqueElements;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: Solution1
 * Description:
 * 很水的一道题。给定一个数组，找出当中不重复的唯一元素，并计算这些元素的和。
 * 用HashMap，运行1ms，0ms的解法是先排序后判断重复元素再求和。
 *
 * @author Lin Hui
 * Created on 2021/2/18 22:54:16
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(4, sumOfUnique(new int[]{1, 2, 3, 2}));
        Assert.assertEquals(0, sumOfUnique(new int[]{1, 1, 1, 1, 1}));
        Assert.assertEquals(15, sumOfUnique(new int[]{1, 2, 3, 4, 5}));
    }

    public int sumOfUnique(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (Integer i : map.keySet()) {
            if (map.get(i) == 1) {
                ans += i;
            }
        }
        return ans;
    }
}
