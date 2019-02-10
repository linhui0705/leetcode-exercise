package P069_SqrtX;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 找平方根，若平方根为小数，抹去小数部分返回
 * 用二分法解决
 *
 * @author Lin Hui
 * Created on 2019-2-10 9:41
 */
public class Solution1 {
    @Test
    public void teseCase() {
        Assert.assertEquals(1, mySqrt(1));
        Assert.assertEquals(2, mySqrt(4));
        Assert.assertEquals(2, mySqrt(8));
        Assert.assertEquals(3, mySqrt(15));
        Assert.assertEquals(6, mySqrt(36));
    }

    public int mySqrt(int x) {
        double start = 1;
        double end = x;
        while ((int) start < (int) end) {
            double i = start + (end - start) / 2;
            if (i * i == x) {
                return (int) i;
            } else if (i * i > x) {
                end = i;
            } else {
                start = i;
            }
        }
        return (int) (start + (end - start) / 2);
    }
}
