package P0849_MaximizeDistanceToClosestPerson;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一个数组，0表示座位上没人，1表示座位上有人。
 * 现在要坐在没人坐的位置上，使得尽可能与座位上坐着的人的距离尽可能地大。
 *
 * @author Lin Hui
 * Created on 2019-12-28 11:26
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(2, maxDistToClosest(new int[]{1, 0, 0, 0, 1, 0, 1}));
        Assert.assertEquals(3, maxDistToClosest(new int[]{1, 0, 0, 0}));
        Assert.assertEquals(3, maxDistToClosest(new int[]{1, 0, 0, 0, 1, 0, 1, 0, 0, 0}));
        Assert.assertEquals(2, maxDistToClosest(new int[]{1, 1, 0, 0, 0, 1, 0}));
    }

    public int maxDistToClosest(int[] seats) {
        int[] left = new int[seats.length];
        int[] right = new int[seats.length];
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                left[i] = right[i] = 0;
            } else {
                int j = i;
                int k = i;
                while (j >= 0 && seats[j] != 1) {
                    j--;
                }
                left[i] = i - j;
                while (k <= seats.length - 1 && seats[k] != 1) {
                    k++;
                }
                right[i] = k - i;
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < seats.length; i++) {
            if (i == seats.length - 1 && seats[i] == 0) {
                max = Math.max(left[i], max);
            } else if (i == 0 && seats[i] == 0) {
                max = Math.max(right[i], max);
            } else {
                max = Math.max(max, Math.min(left[i], right[i]));
            }
        }
        return max;
    }
}
