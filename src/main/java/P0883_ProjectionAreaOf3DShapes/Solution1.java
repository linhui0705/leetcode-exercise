package P0883_ProjectionAreaOf3DShapes;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 题目有些费解，尤其是输入用例。看了大半天才看明白。
 * 而且，题目对输入用例没有明确说明清楚，如果我的输入用例为[[1,2],[1,0,3],[2,5,0,4]]，也没见题意说它不合法。
 * 题目给出的二维数组，数组内的元素就是i行j列放置的方块个数。
 *
 * @author Lin Hui
 * Created on 2019/3/21 15:16
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(5, projectionArea(new int[][]{{2}}));
        Assert.assertEquals(17, projectionArea(new int[][]{{1, 2}, {3, 4}}));
        Assert.assertEquals(8, projectionArea(new int[][]{{1, 0}, {0, 2}}));
        Assert.assertEquals(14, projectionArea(new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}}));
        Assert.assertEquals(21, projectionArea(new int[][]{{2, 2, 2}, {2, 1, 2}, {2, 2, 2}}));
    }

    public int projectionArea(int[][] grid) {
        int ans = 0;
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            int bestRow = 0;
            int bestCol = 0;
            for (int j = 0; j < n; j++) {
                ans += grid[i][j] == 0 ? 0 : 1;
                bestRow = Math.max(bestRow, grid[i][j]);
                bestCol = Math.max(bestCol, grid[j][i]);
            }
            ans += bestRow + bestCol;
        }
        return ans;
    }
}
