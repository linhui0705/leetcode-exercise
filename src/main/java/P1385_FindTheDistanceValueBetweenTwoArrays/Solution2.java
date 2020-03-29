package P1385_FindTheDistanceValueBetweenTwoArrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 * 2ms, faster than 97.41%
 *
 * @author Lin Hui
 * Created on 2020/3/29 4:04 下午
 */
public class Solution2 {
    @Test
    public void testCase() {
        Assert.assertEquals(2, findTheDistanceValue(new int[]{4, 5, 8}, new int[]{10, 9, 1, 8}, 2));
        Assert.assertEquals(2, findTheDistanceValue(new int[]{1, 4, 2, 3}, new int[]{-4, -3, 6, 10, 20, 30}, 3));
        Assert.assertEquals(1, findTheDistanceValue(new int[]{2, 1, 100, 3}, new int[]{-5, -2, 10, -3, 7}, 6));
    }

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans = 0;
        for (int i : arr1) {
            if (isDistanceVal(i, arr2, d)) {
                ans++;
            }
        }
        return ans;
    }

    private boolean isDistanceVal(int x, int[] ys, int d) {
        for (int y : ys) {
            if (Math.abs(x - y) <= d) {
                return false;
            }
        }
        return true;
    }
}
