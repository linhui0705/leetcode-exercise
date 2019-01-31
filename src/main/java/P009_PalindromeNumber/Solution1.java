package P009_PalindromeNumber;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 * 判断数字是否为回文
 * 118ms，超过17.24%，慢
 *
 * @author Lin Hui
 * Created on 2019/1/31 14:02
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertTrue(isPalindrome(121));
        Assert.assertFalse(isPalindrome(-121));
        Assert.assertFalse(isPalindrome(10));
        Assert.assertTrue(isPalindrome(34566543));
        Assert.assertFalse(isPalindrome(-1));
        Assert.assertTrue(isPalindrome(1));
        Assert.assertTrue(isPalindrome(0));
    }

    public boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }
        if (x < 0) {
            return false;
        }
        List<Integer> list = new ArrayList<>();
        while (x > 0) {
            list.add(x % 10);
            x /= 10;
        }
        int n = list.size();
        for (int i = 0; i < n / 2 + 1; i++) {
            if (!list.get(i).equals(list.get(n - 1 - i))) {
                return false;
            }
        }
        return true;
    }
}
