package P1232_CheckIfItIsAStraightLine;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一系列的点，判断这些点在不在同一条直线上
 *
 * @author Lin Hui
 * Created on 2019-12-26 15:39
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertTrue(checkStraightLine(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}}));
        Assert.assertFalse(checkStraightLine(new int[][]{{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}}));
    }

    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 2) {
            return true;
        }
        float k = (float) (coordinates[1][1] - coordinates[0][1]) / (float) ((coordinates[1][0] - coordinates[0][0]));
        for (int i = 2; i < coordinates.length; i++) {
            if (k != (float) (coordinates[i][1] - coordinates[i - 1][1]) / (float) ((coordinates[i][0] - coordinates[i - 1][0]))) {
                return false;
            }
        }
        return true;
    }
}
