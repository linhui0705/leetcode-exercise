package P1732_FindTheHighestAltitude;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 假设高度从0开始，由n+1个点组成，gain数组为两点之间高度差，求最高的高度差。
 *
 * @author Lin Hui
 * Created on 2021/2/12 21:57:27
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(1, largestAltitude(new int[]{-5, 1, 5, 0, -7}));
        Assert.assertEquals(0, largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2}));
    }

    public int largestAltitude(int[] gain) {
        int highest = 0;
        int altitude = 0;
        for (int value : gain) {
            altitude += value;
            highest = Math.max(highest, altitude);
        }
        return highest;
    }
}
