package P1588_SumOfAllOddLengthSubarrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一个整数数组arr，计算其所有的奇数个元素的子数组的总和。
 *
 * @author Lin Hui
 * Created on 2021/2/12 23:11:38
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(58, sumOddLengthSubarrays(new int[]{1, 4, 2, 5, 3}));
        Assert.assertEquals(3, sumOddLengthSubarrays(new int[]{1, 2}));
        Assert.assertEquals(66, sumOddLengthSubarrays(new int[]{10, 11, 12}));
    }

    public int sumOddLengthSubarrays(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if ((j - i + 1) % 2 == 1) {
                    ans += sum;
                }
            }
        }
        return ans;
    }
}
