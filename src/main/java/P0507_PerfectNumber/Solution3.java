package P0507_PerfectNumber;

import org.junit.Test;

/**
 * Title: Solution3
 * Description:
 * 看了题解的方法，解法还是挺巧妙，循环只需用num的平方根即可。
 * 还有，看到打表的，6、28、496、8128、33550336就返回true，其余返回false。这个就挺没意思的了……
 *
 * @author Lin Hui
 * Created on 2019/3/21 10:40
 */
public class Solution3 {
    @Test
    public void testCase() {

    }

    public boolean checkPerfectNumber(int num) {
        if (num < 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i + num / i;
            }
        }
        return num == sum - num;
    }
}
