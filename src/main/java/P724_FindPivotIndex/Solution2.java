package P724_FindPivotIndex;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 * 通过Solution1优化。
 * 1 7 3 6 5 6
 * a b c d e f
 * 稍微变换思路，a+b+c=e+f ⇔ a+b+c+d=d+e+f
 * 16ms，超过89.82%，比Solution1快了一倍
 *
 * @author Lin Hui
 * Created on 2019-1-30 20:38
 */
public class Solution2 {
    @Test
    public void testCase() {
        Assert.assertEquals(3, pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
        Assert.assertEquals(-1, pivotIndex(new int[]{1, 2, 3}));
        Assert.assertEquals(3, pivotIndex(new int[]{1, 5, 9, 6, 2, 5, 8}));
        Assert.assertEquals(2, pivotIndex(new int[]{1, 9, 8, 2, 2, 3, 1, 2}));
        Assert.assertEquals(2, pivotIndex(new int[]{-1, -1, -1, -1, -1, 0}));
        Assert.assertEquals(5, pivotIndex(new int[]{1, 1, 0, -1, -1, -1}));
        Assert.assertEquals(0, pivotIndex(new int[]{-1, -1, -1, 0, 1, 1}));
    }

    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int i : nums) {
            total += i;
        }
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (total - 2 * left == nums[i]) {
                return i;
            }
            left += nums[i];
        }
        return -1;
    }
}
