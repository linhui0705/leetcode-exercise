package P0507_PerfectNumber;

import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 * 稍微做了优化，若num为奇数，则必定不能被偶数整除，可以i=i+2
 * 但奇数仍然没有优化
 * 运行速度也只超过43.77%
 *
 * @author Lin Hui
 * Created on 2019/3/21 10:36
 */
public class Solution2 {
    @Test
    public void testCase() {

    }

    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; ) {
            if (num % i == 0) {
                sum += i;
            }
            if ((num % 2) == 0) {
                i++;
            } else {
                i += 2;
            }
        }
        return num == sum && sum != 0;
    }
}
