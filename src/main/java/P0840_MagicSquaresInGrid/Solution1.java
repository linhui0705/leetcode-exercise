package P0840_MagicSquaresInGrid;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Title: Solution1
 * Description:
 * 题目不难理解吧，就是略坑了些
 * 给定一个二维数组，有多少个3×3的二维数组，符合如下条件：1.横竖对角线和都相等；2.数组内数值无重复，且范围为[1,9]
 *
 * 解这水题的话，就用暴力吧……
 * 不过效率不太高，其实还有更巧妙的思路。
 * 因为符合题意的数组的元素值限定在1-9，且横竖对角线均相等，故只有横线三个元素和、竖线三个元素和、对角线三个元素和均为15，数组才符合题意。
 *
 * @author Lin Hui
 * Created on 2019-2-8 10:46
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(1, numMagicSquaresInside(new int[][]{{4, 3, 8, 4}, {9, 5, 1, 9}, {2, 7, 6, 2}}));
        Assert.assertEquals(0, numMagicSquaresInside(new int[][]{{1, 1, 1}, {4, 5, 6}, {9, 9, 9}}));
        Assert.assertEquals(0, numMagicSquaresInside(new int[][]{{5, 5, 5}, {5, 5, 5}, {5, 5, 5}}));
        Assert.assertEquals(0, numMagicSquaresInside(new int[][]{{10, 3, 5}, {1, 6, 11}, {7, 9, 2}}));
    }

    public int numMagicSquaresInside(int[][] grid) {
        int x = grid.length;
        int y = grid[0].length;
        if (x < 3 || y < 3) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i < x - 1; i++) {
            for (int j = 1; j < y - 1; j++) {
                boolean isRepeat = false;
                Set<Integer> set = new HashSet<>();
                for (int m = -1; m <= 1; m++) {
                    for (int n = -1; n <= 1; n++) {
                        int num = grid[i - m][j - n];
                        if (!set.add(num) || !(num >= 1 && num <= 9)) {
                            isRepeat = true;
                        }
                    }
                    if (isRepeat) {
                        break;
                    }
                }

                boolean isEqual = (grid[i - 1][j - 1] + grid[i + 1][j + 1] == grid[i][j - 1] + grid[i][j + 1]) &&
                        (grid[i][j - 1] + grid[i][j + 1] == grid[i + 1][j - 1] + grid[i - 1][j + 1]) &&
                        (grid[i + 1][j - 1] + grid[i - 1][j + 1] == grid[i - 1][j] + grid[i + 1][j]) &&
                        (grid[i][j - 1] + grid[i + 1][j - 1] == grid[i - 1][j] + grid[i - 1][j + 1]) &&
                        (grid[i - 1][j - 1] + grid[i - 1][j] == grid[i][j + 1] + grid[i + 1][j + 1]) &&
                        (grid[i - 1][j + 1] + grid[i][j + 1] == grid[i + 1][j - 1] + grid[i + 1][j]) &&
                        (grid[i - 1][j - 1] + grid[i][j - 1] == grid[i + 1][j] + grid[i + 1][j + 1]);
                if (isEqual && !isRepeat) {
                    count++;
                }
            }
        }
        return count;
    }
}
