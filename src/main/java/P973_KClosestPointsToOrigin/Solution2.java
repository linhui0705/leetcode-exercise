package P973_KClosestPointsToOrigin;

import org.junit.Test;

import java.util.Arrays;

/**
 * Title: Solution2
 * Description:
 *
 * @author Lin Hui
 * Created on 2019/2/13 8:55
 */
public class Solution2 {
    @Test
    public void testCase() {

    }

    public int[][] kClosest(int[][] points, int K) {
        int[][] ans = new int[K][2];
        int[] result = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            result[i] = points[i][0] * points[i][0] + points[i][1] * points[i][1];
        }
        Arrays.sort(result);
        int kNum = result[K - 1];
        int j = 0;
        for (int i = 0; i < points.length; i++) {
            if (kNum >= points[i][0] * points[i][0] + points[i][1] * points[i][1]) {
                ans[j][0] = points[i][0];
                ans[j][1] = points[i][1];
                j++;
            }
        }
        return ans;
    }
}
