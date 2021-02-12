package P1486_XOROperationInAnArray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一个整数n和整数start。现定义一个数组nums，nums[i]=start+2*i，返回数组全部元素异或后的值。
 *
 * @author Lin Hui
 * Created on 2021/2/12 21:27:48
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(8, xorOperation(5, 0));
        Assert.assertEquals(8, xorOperation(4, 3));
        Assert.assertEquals(7, xorOperation(1, 7));
        Assert.assertEquals(2, xorOperation(10, 5));
    }

    public int xorOperation(int n, int start) {
        int ans = start;
        for (int i = 1; i < n; i++) {
            ans = ans ^ (start + 2 * i);
        }
        return ans;
    }
}
