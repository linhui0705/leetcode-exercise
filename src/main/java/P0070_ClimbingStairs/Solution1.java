package P0070_ClimbingStairs;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: Solution1
 * Description:
 * 爬楼梯，每次爬1个阶梯或2个阶梯。爬n阶有多少种走法。
 * 问题的本质就是斐波那契数列。结合动态规划的解题思路去完成这道水题。
 *
 * @author Lin Hui
 * Created on 2021/9/9 22:30:31
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(1, climbStairs(1));
        Assert.assertEquals(2, climbStairs(2));
        Assert.assertEquals(3, climbStairs(3));
        Assert.assertEquals(5, climbStairs(4));
        Assert.assertEquals(8, climbStairs(5));
        Assert.assertEquals(55, climbStairs(9));
        Assert.assertEquals(1836311903, climbStairs(45));
    }

    public Map<Integer, Integer> map = new HashMap<>();

    public int climbStairs(int n) {
        if (map.containsKey(n)) {
            return map.get(n);
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        map.put(n - 1, climbStairs(n - 1));
        map.put(n - 2, climbStairs(n - 2));
        return map.get(n - 1) + map.get(n - 2);
    }
}
