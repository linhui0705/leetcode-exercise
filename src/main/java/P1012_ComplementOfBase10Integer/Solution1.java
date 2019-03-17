package P1012_ComplementOfBase10Integer;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 求非负数的补码，即二进制的各位数取反
 *
 * @author Lin Hui
 * Created on 2019-3-17 15:26
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(2, bitwiseComplement(5));
        Assert.assertEquals(0, bitwiseComplement(7));
        Assert.assertEquals(5, bitwiseComplement(10));
    }

    public int bitwiseComplement(int N) {
        char[] chars = Integer.toBinaryString(N).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = chars[i] == '0' ? '1' : '0';
        }
        int ans = 0;
        int j = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            ans += Math.pow(2, j) * (chars[i] - '0');
            j++;
        }
        return ans;
    }
}
