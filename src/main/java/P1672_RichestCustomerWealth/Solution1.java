package P1672_RichestCustomerWealth;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一个m*n的二维数组，元素accounts[i][j]指的是第i个土豪在第j个银行的资产。返回最壕的资产。
 * 题目的本质就是返回最大的一行的和
 *
 * @author Lin Hui
 * Created on 2021/2/10 10:34:03
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(6, maximumWealth(new int[][]{{1, 2, 3}, {3, 2, 1}}));
        Assert.assertEquals(10, maximumWealth(new int[][]{{1, 5}, {7, 3}, {3, 5}}));
        Assert.assertEquals(17, maximumWealth(new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}}));
    }

    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
