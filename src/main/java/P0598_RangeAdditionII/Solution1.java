package P0598_RangeAdditionII;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定矩阵m*n，以及矩阵自增操作的范围ops，对矩阵的范围ops[i][0], ops[i][1]的子元素自增1。
 * 返回矩阵内最大值的个数。
 *
 * @author Lin Hui
 * Created on 2019/2/25 16:02
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(4, maxCount(3, 3, new int[][]{{2, 2}, {3, 3}}));
    }

    public int maxCount(int m, int n, int[][] ops) {
        int x = m;
        int y = n;
        for (int[] t : ops) {
            x = Math.min(x, t[0]);
            y = Math.min(y, t[1]);
        }
        return x * y;
    }
}
