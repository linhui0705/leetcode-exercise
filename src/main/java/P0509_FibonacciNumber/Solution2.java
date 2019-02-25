package P0509_FibonacciNumber;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 *
 * @author Lin Hui
 * Created on 2019-1-19 21:30
 */
public class Solution2 {
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
        int[] arrays = new int[N + 1];
        arrays[0] = 0;
        arrays[1] = 1;
        for (int i = 2; i <= N; i++) {
            arrays[i] = arrays[i - 1] + arrays[i - 2];
        }
        return arrays[N];
    }
}
