package P1266_MinimumTimeVisitingAllPoints;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 按照给定点坐标顺序，算出遍历所有点的最小距离。横走、竖走一个单位算1秒，斜着45度走也算1秒(e.g.:(1,1)->(2,2))
 *
 * @author Lin Hui
 * Created on 2019/12/25 22:11
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(7, minTimeToVisitAllPoints(new int[][]{{1, 1}, {3, 4}, {-1, 0}}));
        Assert.assertEquals(5, minTimeToVisitAllPoints(new int[][]{{3, 2}, {-2, 2}}));
    }

    public int minTimeToVisitAllPoints(int[][] points) {
        if (points.length <= 1) {
            return 0;
        }
        int time = 0;
        for (int i = 1; i < points.length; i++) {
            int row = Math.abs(points[i - 1][0] - points[i][0]);
            int col = Math.abs(points[i - 1][1] - points[i][1]);
            int min = Math.min(row, col);
            time += row + col - min;
        }
        return time;
    }
}
