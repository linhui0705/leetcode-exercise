package P1252_CellsWithOddValuesInAMatrix;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定数组大小和坐标(r,c)，每次对数组的r行和c列元素加1，最后统计数组中元素奇数个数。
 *
 * @author Lin Hui
 * Created on 2019-12-26 13:57
 */
public class Solution1 {
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
                if (++grid[i][coordinate[1]] % 2 != 0) {
                    ans++;
                } else {
                    ans--;
                }
            }
            for (int i = 0; i < m; i++) {
                if (++grid[coordinate[0]][i] % 2 != 0) {
                    ans++;
                } else {
                    ans--;
                }
            }
        }
        return ans;
    }
}
