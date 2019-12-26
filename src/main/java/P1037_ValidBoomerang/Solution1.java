package P1037_ValidBoomerang;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 判断三点是否不共线
 *
 * @author Lin Hui
 * Created on 2019-12-26 21:58
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertTrue(isBoomerang(new int[][]{{1, 1}, {2, 3}, {3, 2}}));
        Assert.assertFalse(isBoomerang(new int[][]{{1, 1}, {2, 2}, {3, 3}}));
    }

    public boolean isBoomerang(int[][] points) {
        boolean isLine = (points[1][1] - points[0][1]) * (points[2][0] - points[1][0]) == (points[2][1] - points[1][1]) * (points[1][0] - points[0][0]);
        boolean isSame = (points[0][0] == points[1][0] && points[0][1] == points[1][1]) ||
                (points[1][0] == points[2][0] && points[1][1] == points[2][1]) ||
                (points[0][0] == points[2][0] && points[0][1] == points[2][1]);
        return !(isLine || isSame);
    }
}
