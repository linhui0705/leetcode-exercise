package P0172_FactorialTrailingZeroes;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 计算n的阶乘末尾有多少个零
 * 题目要求O(logn)的时间复杂度
 * 这个是看了题解，还是解得很巧妙的。
 * 10=2×5，2的数量是远比5多的，只要算出阶乘里有多少个5，就可以知道阶乘末尾有多少个零。
 * e.g.:1×2×3×4  ×5  ×6×7    ×8  ×9 ×10=3628800
 *     →1×2×3×2×2×5×2×3×7×2×2×2×3×3×2×5=3628800
 *
 * @author Lin Hui
 * Created on 2019/2/26 17:09
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(0, trailingZeroes(3));
        Assert.assertEquals(1, trailingZeroes(5));
    }

    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }
}
