package P1848_MinimumDistanceToTheTargetElement;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一个数组nums、目标数target和起始索引start。计算从start索引号开始到target元素的最小距离。
 * 水题。O(N)滚一遍就知道结果了。
 *
 * @author Lin Hui
 * Created on 2021/2/21 15:44:57
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(1, getMinDistance(new int[]{1, 2, 3, 4, 5}, 5, 3));
        Assert.assertEquals(0, getMinDistance(new int[]{1}, 1, 0));
        Assert.assertEquals(0, getMinDistance(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 1, 0));
    }

    public int getMinDistance(int[] nums, int target, int start) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                min = Math.min(min, Math.abs(i - start));
            }
        }
        return min;
    }
}
