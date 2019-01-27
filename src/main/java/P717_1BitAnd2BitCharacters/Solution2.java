package P717_1BitAnd2BitCharacters;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 * Solution题解，思路比较巧妙，借助了bits数组元素的1
 *
 * @author Lin Hui
 * Created on 2019-1-27 22:09
 */
public class Solution2 {
    @Test
    public void testCase() {
        Assert.assertTrue(isOneBitCharacter(new int[]{1, 0, 0}));
        Assert.assertFalse(isOneBitCharacter(new int[]{1, 1, 1, 0}));
    }

    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        int i = 0;
        while (i < n - 1) {
            i += bits[i] + 1;
        }
        return i == n - 1;
    }
}
