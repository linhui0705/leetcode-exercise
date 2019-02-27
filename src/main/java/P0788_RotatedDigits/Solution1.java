package P0788_RotatedDigits;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 好数：给定一个数n，若n每一位的数字翻转180度后，这个数值与n不相等，则这个数就是好数。
 * 0,1,8翻转后仍为其自身；2翻转后变成5；5翻转后变成2；6翻转后变成9；9翻转后变成6；其他数字翻转后不是数字，必定不是好数。
 * <p>
 * 判断1-N有多少个好数
 *
 * @author Lin Hui
 * Created on 2019/2/27 12:31
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(4, rotatedDigits(10));
    }

    int[] gn = new int[]{0, 1, 5, -1, -1, 2, 9, -1, 8, 6};

    public int rotatedDigits(int N) {
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            if (isGoodNumber(i)) {
                ans++;
            }
        }
        return ans;
    }

    public boolean isGoodNumber(int i) {
        boolean b = false;
        while (i > 0) {
            if (gn[i % 10] == -1) {
                return false;
            } else if (i % 10 != gn[i % 10]) {
                b = true;
            }
            i /= 10;
        }
        return b;
    }
}
