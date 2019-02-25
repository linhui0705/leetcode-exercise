package P0717_1BitAnd2BitCharacters;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 碰到0，i=i+1；碰到1，i=i+2。最后判断是1位还是2位。
 * 运行用时4ms，超过55.56%
 *
 * @author Lin Hui
 * Created on 2019-1-27 21:56
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertTrue(isOneBitCharacter(new int[]{1, 0, 0}));
        Assert.assertFalse(isOneBitCharacter(new int[]{1, 1, 1, 0}));
    }

    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        int i = 0;
        while (i < n) {
            if (bits[i] == 0) {
                if (i + 1 >= n) {
                    return true;
                }
                i++;
            } else if (bits[i] == 1) {
                if (i + 2 >= n) {
                    return false;
                }
                i += 2;
            }
        }
        System.err.println("error");
        return true;
    }
}
