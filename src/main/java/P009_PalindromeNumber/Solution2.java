package P009_PalindromeNumber;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 * Solution的题解，比自己题解少了些循环，但还是不快啊……
 *
 * @author Lin Hui
 * Created on 2019/1/31 14:23
 */
public class Solution2 {
    @Test
    public void testCase() {
        Assert.assertTrue(isPalindrome(121));
        Assert.assertFalse(isPalindrome(-121));
        Assert.assertFalse(isPalindrome(103));
        Assert.assertTrue(isPalindrome(34566543));
        Assert.assertFalse(isPalindrome(-1));
        Assert.assertTrue(isPalindrome(1));
        Assert.assertTrue(isPalindrome(0));
    }

    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNum = 0;
        while (x > revertedNum) {
            revertedNum = revertedNum * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNum || x == revertedNum / 10;
    }
}
