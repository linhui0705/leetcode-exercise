package P0191_NumberOf1Bits;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 计算无符号整数的二进制数有多少个1
 * 本题通过位运算来解决
 *
 * @author Lin Hui
 * Created on 2019-2-13 23:35
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n = n >>> 1;
        }
        return count;
    }
}
