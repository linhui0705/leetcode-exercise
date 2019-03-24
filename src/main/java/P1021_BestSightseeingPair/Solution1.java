package P1021_BestSightseeingPair;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一个数组，求A[i]+A[j]+i-j的最大值(i<j)
 *
 * @author Lin Hui
 * Created on 2019-3-24 13:47
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(11, maxScoreSightseeingPair(new int[]{8, 1, 5, 2, 6}));
    }

    public int maxScoreSightseeingPair(int[] A) {
        int n = A.length;
        int iMax = -1000;
        int jMax = -1000;
        for (int i = 0; i < n; i++) {
            iMax = Math.max(A[i] - i + jMax, iMax);
            jMax = Math.max(A[i] + i, jMax);
        }
        return iMax;
    }
}
