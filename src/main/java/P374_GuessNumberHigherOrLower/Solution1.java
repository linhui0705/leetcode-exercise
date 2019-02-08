package P374_GuessNumberHigherOrLower;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * Ⅰ.int i = (start + end) / 2;
 * Ⅱ.int i = start + (end - start) / 2;
 * Ⅱ相比于Ⅰ，可以预防int类型相加后溢出
 *
 * @author Lin Hui
 * Created on 2019-2-8 16:55
 */
public class Solution1 extends GuessGame {
    @Test
    public void testCase() {
        Assert.assertEquals(6, guessNumber(10));
    }

    public int guessNumber(int n) {
        return binarySearch(1, n);
    }

    public int binarySearch(int start, int end) {
        while (start <= end) {
            int i = start + (end - start) / 2;
            int ans = guess(i);
            if (ans == 0) {
                return i;
            } else if (ans == 1) {
                start = i + 1;
            } else if (ans == -1) {
                end = i - 1;
            }
        }
        return -1;
    }
}
