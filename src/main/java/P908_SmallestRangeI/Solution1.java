package P908_SmallestRangeI;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 有点羞耻，看了好多遍题目一脸懵逼，直到看了人家解题报告的题意才恍然大悟……
 * 题目的答案取决于数组的最大值和最小值，以及区间[-K,K]。K区间取值加到数组的元素上，使得数组最大值和最小值的差最小，并返回这个差值。
 *
 * @author Lin Hui
 * Created on 2019-1-22 21:23
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(0, smallestRangeI(new int[]{1}, 0));
        Assert.assertEquals(6, smallestRangeI(new int[]{0, 10}, 2));
        Assert.assertEquals(0, smallestRangeI(new int[]{1, 3, 6}, 3));
    }

    public int smallestRangeI(int[] A, int K) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int a : A) {
            min = min > a ? a : min;
            max = max < a ? a : max;
        }
        if (max - K <= min + K) {
            return 0;
        } else {
            return max - min - 2 * K;
        }
    }
}
