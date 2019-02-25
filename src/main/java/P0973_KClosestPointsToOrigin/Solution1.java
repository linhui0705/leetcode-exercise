package P0973_KClosestPointsToOrigin;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Title: Solution1
 * Description:
 * 求距离原点最近的K个点
 * 直接取平方和比较就好，不必再求平方根。看了题解，排序的解法，可以不用HashMap，可先排序后去找第K小的数，然后用这个数去比较。
 * 或者用分治法。时间关系，准备睡觉。有空再看。
 *
 * @author Lin Hui
 * Created on 2019-2-12 23:00
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public int[][] kClosest(int[][] points, int K) {
        int[][] ans = new int[K][2];
        int[] result = new int[points.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            result[i] = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            map.put(result[i], i);
        }
        Arrays.sort(result);
        for (int i = 0; i < K; i++) {
            int index = map.get(result[i]);
            ans[i] = points[index];
        }
        return ans;
    }
}
