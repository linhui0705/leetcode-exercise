package P0190_ReverseBits;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 反转二进制位，给定一个unsigned int类型的数，将其对应的二进制数反转，返回反转后二进制数所对应的十进制数。
 * >>> 不带符号右移数位，即逻辑右移
 * >> 带符号右移数位，即算数右移
 *
 * @author Lin Hui
 * Created on 2020-1-18 23:31
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public int reverseBits(int n) {
        int result = 0;
        int k = 32;
        while (n != 0) {
            result = (result << 1) + (n & 1);
            n = n >>> 1;
            k--;
        }
        return result << k;
    }
}
