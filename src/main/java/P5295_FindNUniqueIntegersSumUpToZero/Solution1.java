package P5295_FindNUniqueIntegersSumUpToZero;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定数组的长度，返回一个数组，数组内的元素唯一，且数组内元素和为0。另外，数组的序列不限定。
 *
 * @author Lin Hui
 * Created on 2019-12-29 14:47
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertArrayEquals(new int[]{0}, sumZero(1));
        Assert.assertArrayEquals(new int[]{-1, 1}, sumZero(2));
        Assert.assertArrayEquals(new int[]{-1, 1, 0}, sumZero(3));
        Assert.assertArrayEquals(new int[]{-1, 1, -2, 2, 0}, sumZero(5));
    }

    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int length = (n % 2 == 0) ? n : n - 1;
        int k = 1;
        for (int i = 0; i < length - 1; ) {
            ans[i++] = -k;
            ans[i++] = k++;
        }
        return ans;
    }
}
