package P0463_IslandPerimeter;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2018/3/30 15:02
 */
public class Solution1 {
    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}
        };
        System.out.println(islandPerimeter(grid));
    }

    public static int islandPerimeter(int[][] grid) {
        int island = 0;
        int connect = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    island++;
                    if (i > 0 && grid[i][j] == grid[i - 1][j]) {
                        connect++;
                    }
                    if (j < grid[i].length - 1 && grid[i][j] == grid[i][j + 1]) {
                        connect++;
                    }
                }
            }
        }
        return island * 4 - connect * 2;
    }
}
