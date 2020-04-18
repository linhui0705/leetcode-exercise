package P0200_NumberOfIslands;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一个二维数组，0表示海面，1表示陆地，求二维数组中岛屿的数量。
 * 对二维数组做DFS或BFS，往上下左右四个方向进行遍历，遍历过的元素由1变更为0。
 *
 * @author Lin Hui
 * Created on 2020/4/18 19:03:12
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(1, numIslands(new char[][]{{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}}));
        Assert.assertEquals(3, numIslands(new char[][]{{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}}));
    }

    public int numIslands(char[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    ans += dfs(grid, i, j);
                }
            }
        }
        return ans;
    }

    public int dfs(char[][] grid, int r, int c) {
        //System.out.println(r+","+c);
        if (grid[r][c] == '0') {
            return 0;
        }
        grid[r][c] = '0';
        if (c - 1 >= 0) {
            //System.out.println("left");
            dfs(grid, r, c - 1);
        }
        if (c + 1 < grid[0].length) {
            //System.out.println("right");
            dfs(grid, r, c + 1);
        }
        if (r - 1 >= 0) {
            //System.out.println("top");
            dfs(grid, r - 1, c);
        }
        if (r + 1 < grid.length) {
            //System.out.println("down");
            dfs(grid, r + 1, c);
        }
        return 1;
    }
}
