package P0009_PalindromeNumber;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution3
 * Description:
 * 最快的题解，代码间接，没有使用额外的空间，对余数为0的数做了判断，减少多余的运算，速度确实快了很多
 *
 * @author Lin Hui
 * Created on 2019/1/31 14:46
 */
public class Solution3 {
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
        return reverse(x) == x;
    }


    private int reverse(int x) {
        int reverse = 0;
        while (x > 0) {
            reverse = reverse * 10 + (x % 10);
            x /= 10;
        }
        return reverse;
    }
}
