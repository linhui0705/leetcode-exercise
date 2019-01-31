package P633_SumOfSquareNumbers;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 刚开始考虑用暴力，用两个for循环，结果超时了。
 * 看了题解，有用到Math.sqrt()方法算平方根。
 * 代码写出了，结果仍然超时。
 * 再仔细看题解，题目的for循环是用long的，而我是用int的。打了System Out，发现long做循环的话到46340就结束了，而int做，循环到上百万都停不下来。
 * 后来才想起来，46341*46341是大于Integer.MAX_VALUE，会溢出变成负数，导致循环停不下来。
 * 所以，最后，用long做循环，或者加上i*i>=0的判断。
 * <p>
 * 题解还有更好的，用二分查找，或费马定理（Fermat Theorem），时间关系，有空再看……
 *
 * @author Lin Hui
 * Created on 2019/1/31 16:57
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertTrue(judgeSquareSum(5));
        Assert.assertFalse(judgeSquareSum(3));
        Assert.assertFalse(judgeSquareSum(2147483646));
    }

    public boolean judgeSquareSum(int c) {
        for (long i = 0; i * i <= c; i++) {
            double d = Math.sqrt(c - i * i);
            if (d == (int) d) {
                return true;
            }
        }
        return false;
    }
}
