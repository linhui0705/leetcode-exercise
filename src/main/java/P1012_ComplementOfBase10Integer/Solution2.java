package P1012_ComplementOfBase10Integer;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Solution2
 * Description:
 * 优化，做位运算
 *
 * @author Lin Hui
 * Created on 2019-3-17 15:28
 */
public class Solution2 {
    @Test
    public void testCase() {
        Assert.assertEquals(2, bitwiseComplement(5));
        Assert.assertEquals(0, bitwiseComplement(7));
        Assert.assertEquals(4, bitwiseComplement(11));
        Assert.assertEquals(0, bitwiseComplement(0));
    }

    public int bitwiseComplement(int N) {
        if (N == 0) {
            return 1;
        }
        int ans = 0;
        List<Integer> bits = new ArrayList<>();
        while (N > 0) {
            bits.add(((N & 1) == 1 ? 0 : 1));
            N >>= 1;
        }
        int p = 1;
        for (int i = 0, len = bits.size(); i < len; i++) {
            ans += p * bits.get(i);
            p <<= 1;
        }
        return ans;
    }
}
