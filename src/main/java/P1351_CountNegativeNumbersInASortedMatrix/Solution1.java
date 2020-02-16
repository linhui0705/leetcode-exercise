package P1351_CountNegativeNumbersInASortedMatrix;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定二维数组，找出元素是负数的数量
 *
 * @author Lin Hui
 * Created on 2020/2/16 16:32
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(8, countNegatives(new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}}));
        Assert.assertEquals(0, countNegatives(new int[][]{{3, 2}, {1, 0}}));
        Assert.assertEquals(3, countNegatives(new int[][]{{1, -1}, {-1, -1}}));
        Assert.assertEquals(1, countNegatives(new int[][]{{-1}}));
    }

    public int countNegatives(int[][] grid) {
        int ans = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] < 0) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
