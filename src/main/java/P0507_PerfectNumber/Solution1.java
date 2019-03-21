package P0507_PerfectNumber;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 判断一个数是否为完数
 * e.g.:28=1+2+4+7+14，28能被1,2,4,7,14整除。
 * 从i=1遍历至num/2，若num=100000000，则for循环需要遍历五千万次。
 * 提交的代码只超过32.64%
 *
 * @author Lin Hui
 * Created on 2019/3/21 10:25
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return num == sum && sum != 0;
    }
}
