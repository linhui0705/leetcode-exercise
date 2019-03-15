package P1005_MaximizeSumOfArrayAfterKNegations;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Title: Solution1
 * Description:
 * 抽个空重新整理自己在LeetCode题解……
 * 题目大意是：给定数组A，将任一数组元素A[i]变为-A[i]，进行K次取反操作。返回操作后的最大数组和。
 * 这个题就是取最大解，应该用贪心。
 * 这里有个偷懒的方法，在周赛偷步AC，排名可以靠前……
 * 先将数组进行排序，然后先将数组内的负数元素变负（负负得正）。若取反后数组内所有元素均为非负数，且K仍有剩余次数，则再排序，将当前数组最小的元素变为负数。
 * e.g:
 * 2 -3  1  5 -4  K=3
 * => -4 -3  1  2  5  K=3
 * =>  4  3  1  2  5  K=1
 * =>  1  2  3  4  5  K=1
 * => -1  2  3  4  5  K=0
 * ∴ ans=-1+2+3+4+5=13
 *
 * @author Lin Hui
 * Created on 2019/3/15 14:23
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(5, largestSumAfterKNegations(new int[]{4, 2, 3}, 1));
        Assert.assertEquals(6, largestSumAfterKNegations(new int[]{3, -1, 0, 2}, 3));
        Assert.assertEquals(13, largestSumAfterKNegations(new int[]{2, -3, -1, 5, -4}, 2));
        Assert.assertEquals(13, largestSumAfterKNegations(new int[]{2, -3, 1, 5, -4}, 3));
    }

    public int largestSumAfterKNegations(int[] A, int K) {
        int ans = 0;
        Arrays.sort(A);
        for (int i = 0; i < A.length && A[i] < 0 && K > 0; i++) {
            A[i] = -A[i];
            K--;
        }
        if (K > 0) {
            Arrays.sort(A);
            if (K % 2 == 1) {
                A[0] = -A[0];
            }
        }
        for (int i : A) {
            ans += i;
        }
        return ans;
    }
}
