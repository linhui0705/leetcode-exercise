package P1295_FindNumbersWithEvenNumberOfDigits;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 数组中偶数位数的数字个数
 *
 * @author Lin Hui
 * Created on 2019/12/25 11:31
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(2, findNumbers(new int[]{12, 345, 2, 6, 7896}));
        Assert.assertEquals(1, findNumbers(new int[]{555, 901, 482, 1771}));
    }

    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            int count = 0;
            while (num != 0) {
                num /= 10;
                count++;
            }
            if (count % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }
}
