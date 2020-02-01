package P1323_Maximum69Number;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一个正整数，各位数值只有6或9。现有至多一次机会，可以将6变成9，或将9变成6，使得这个数尽可能达到最大。
 * 既然要这个数变得尽可能地最大，就只能将数字中的6变成9，而不可能将9变成6，并且找到最大数位的6进行变更。
 * e.g.:9669，则只能将百位的6变成9，才能使得这个数最大。
 *
 * @author Lin Hui
 * Created on 2020-1-20 11:33
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(9969, maximum69Number(9669));
        Assert.assertEquals(9999, maximum69Number(9996));
        Assert.assertEquals(9999, maximum69Number(9999));
    }

    public int maximum69Number(int num) {
        int maxSix = -1;
        int ans = 0;
        int k = 0;
        while (num > 0) {
            int mod = num % 10;
            ans += mod * Math.pow(10, k);
            if (mod == 6) {
                maxSix = k;
            }
            num /= 10;
            k++;
        }
        if (maxSix > -1) {
            ans += 3 * Math.pow(10, maxSix);
        }
        return ans;
    }
}
