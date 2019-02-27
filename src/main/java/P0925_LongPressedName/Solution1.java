package P0925_LongPressedName;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * name和typed字符串比较，检查typed某些字符是否有长按
 * 通过Two Pointers比较字符
 *
 * @author Lin Hui
 * Created on 2019/2/27 10:31
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertTrue(isLongPressedName("alex", "aaleex"));
        Assert.assertFalse(isLongPressedName("saeed", "ssaaedd"));
        Assert.assertTrue(isLongPressedName("leelee", "lleeelee"));
        Assert.assertTrue(isLongPressedName("laiden", "laiden"));
    }

    public boolean isLongPressedName(String name, String typed) {
        int i = 0;
        int j = 0;
        while (i < name.length() && j < typed.length()) {
            if (name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        while (j < typed.length() && name.charAt(i - 1) == typed.charAt(j)) {
            j++;
        }
        return i == name.length() && j == typed.length();
    }
}
