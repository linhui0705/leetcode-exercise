package P509_FibonacciNumber;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2019-1-19 21:26
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(1, fib(2));
        Assert.assertEquals(2, fib(3));
        Assert.assertEquals(3, fib(4));
    }

    public int fib(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        return fib(N - 1) + fib(N - 2);
    }
}
