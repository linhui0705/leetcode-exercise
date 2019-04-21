package P1029_TwoCityScheduling;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * Title: Solution2
 * Description:
 * 来自周赛，这是占据前三的大佬uwi代码
 * 先直接取costs[i][0]的和，同时用数组取差值，进行排序，加回前n/2小的差值。很巧妙的思路。
 *
 * @author Lin Hui
 * Created on 2019-4-21 20:20
 */
public class Solution2 {
    @Test
    public void testCase() {
        Assert.assertEquals(110, twoCitySchedCost(new int[][]{{10, 20}, {30, 200}, {400, 50}, {30, 20}}));
        Assert.assertEquals(1859, twoCitySchedCost(new int[][]{{259, 770}, {448, 54}, {926, 667}, {184, 139}, {840, 118}, {577, 469}}));
    }

    public int twoCitySchedCost(int[][] costs) {
        int base = 0;
        int n = costs.length;
        int[] cs = new int[n];
        int p = 0;
        for (int[] c : costs) {
            base += c[0];
            cs[p++] = c[1] - c[0];
        }
        Arrays.sort(cs);
        for (int i = 0; i < n / 2; i++) {
            base += cs[i];
        }
        return base;
    }
}
