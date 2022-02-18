package P1929_ConcatenationOfArray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一个长度为n的数组num，现要构建长度为2n的数组ans，且新数组要满足两个条件：
 * ans[i] == nums[i];
 * ans[i + n] == nums[i];
 * 本质上就是两个nums数组串连得到ans
 *
 * @author Lin Hui
 * Created on 2022/2/18 10:01:57
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertArrayEquals(new int[]{1, 2, 1, 1, 2, 1}, getConcatenation(new int[]{1, 2, 1}));
        Assert.assertArrayEquals(new int[]{1, 3, 2, 1, 1, 3, 2, 1}, getConcatenation(new int[]{1, 3, 2, 1}));
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7}, getConcatenation(new int[]{1, 2, 3, 4, 5, 6, 7}));
    }

    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = ans[i + n] = nums[i];
        }
        return ans;
    }
}
