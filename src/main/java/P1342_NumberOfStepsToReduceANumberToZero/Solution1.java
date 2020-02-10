package P1342_NumberOfStepsToReduceANumberToZero;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一个非负整数，若是奇数则减1，若是偶数则除以2，如此循环操作，直到这个数为0，求操作的次数。
 *
 * @author Lin Hui
 * Created on 2020/2/10 12:14
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(6, numberOfSteps(14));
        Assert.assertEquals(4, numberOfSteps(8));
        Assert.assertEquals(12, numberOfSteps(123));
        Assert.assertEquals(0, numberOfSteps(0));
    }

    public int numberOfSteps(int num) {
        int ans = 0;
        while (num > 0) {
            if ((num & 1) == 0) {
                num = num >> 1;
            } else {
                num -= 1;
            }
            ans++;
        }
        return ans;
    }
}
