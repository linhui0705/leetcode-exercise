package P1281_SubtractTheProductAndSumOfDigitsOfAnInteger;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定整数n，算出各个位数的乘积与各个位数的和，计算二者的差
 *
 * @author Lin Hui
 * Created on 2019/12/25 12:35 下午
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(15, subtractProductAndSum(234));
        Assert.assertEquals(21, subtractProductAndSum(4421));
    }

    public int subtractProductAndSum(int n) {
        int multi = 1;
        int add = 0;
        while (n != 0) {
            int mod = n % 10;
            multi *= mod;
            add += mod;
            n /= 10;
        }
        return multi - add;
    }
}
