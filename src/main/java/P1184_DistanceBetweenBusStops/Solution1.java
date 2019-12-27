package P1184_DistanceBetweenBusStops;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 环线公交的两站最短距离，公交路线可顺时针也可逆时针。
 *
 * @author Lin Hui
 * Created on 2019/12/27 12:05 下午
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(1, distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 1));
        Assert.assertEquals(3, distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 2));
        Assert.assertEquals(4, distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 3));
    }

    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int i = start;
        int j = destination;
        int n = distance.length;
        int ansi = 0;
        int ansj = 0;
        while (i % n != destination) {
            ansi += distance[i++ % n];
        }
        while (j % n != start) {
            ansj += distance[j++ % n];
        }
        return Math.min(ansi, ansj);
    }
}
