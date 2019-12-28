package P1137_NthTribonacciNumber;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 增强版斐波纳契函数Tribonacci
 * 递归会TLE，故用迭代求解。
 *
 * @author Lin Hui
 * Created on 2019-12-28 22:40
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(4, tribonacci(4));
        Assert.assertEquals(1389537, tribonacci(25));
        Assert.assertEquals(2082876103, tribonacci(37));
    }

    public int tribonacci(int n) {
        // switch(n){
        //     case 0:
        //         return 0;
        //     case 1:
        //     case 2:
        //         return 1;
        //     default:
        //         break;
        // }
        // return tribonacci(n-3)+tribonacci(n-2)+tribonacci(n-1);
        int[] ans = new int[38];
        ans[0] = 0;
        ans[1] = 1;
        ans[2] = 1;
        for (int i = 3; i <= n; i++) {
            ans[i] = ans[i - 3] + ans[i - 2] + ans[i - 1];
        }
        return ans[n];
    }
}
