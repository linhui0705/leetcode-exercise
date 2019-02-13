package P762_PrimeNumberOfSetBitsInBinaryRepresentation;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 从题目的输入规模看，L和R最大值也就是10^6，转换为二进制数，长度也就20位。
 * 因此，质数的数量也就屈指可数了。剩下的也就是将十进制数转换为二进制，然后数1的数量了。
 *
 * @author Lin Hui
 * Created on 2019-2-13 23:21
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(4, countPrimeSetBits(6, 10));
        Assert.assertEquals(5, countPrimeSetBits(10, 15));
    }

    public int countPrimeSetBits(int L, int R) {
        int ans = 0;
        for (int i = L; i <= R; i++) {
            int k = i;
            int count = 0;
            while (k > 0) {
                count += (k & 1);
                k = k >>> 1;
            }
            if (isPrime(count)) {
                ans++;
            }
        }

        return ans;
    }

    public boolean isPrime(int n) {
        return n == 2 || n == 3 || n == 5 || n == 7 || n == 11 || n == 13 || n == 17 || n == 19;
    }
}
