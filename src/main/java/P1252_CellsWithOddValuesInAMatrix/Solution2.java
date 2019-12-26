package P1252_CellsWithOddValuesInAMatrix;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 *
 * @author Lin Hui
 * Created on 2019-12-26 14:06
 */
public class Solution2 {
    @Test
    public void testCase() {
        Assert.assertEquals(6, oddCells(2, 3, new int[][]{{0, 1}, {1, 1}}));
        Assert.assertEquals(0, oddCells(2, 2, new int[][]{{1, 1}, {0, 0}}));
    }

    public int oddCells(int n, int m, int[][] indices) {
        int ans = 0;
        int[][] grid = new int[n][m];
        for (int[] coordinate : indices) {
            for (int i = 0; i < n; i++) {
                ++grid[i][coordinate[1]];
            }
            for (int i = 0; i < m; i++) {
                ++grid[coordinate[0]][i];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] % 2 != 0) {
                    ans++;
                }
            }
        }
        return ans;
    }
}