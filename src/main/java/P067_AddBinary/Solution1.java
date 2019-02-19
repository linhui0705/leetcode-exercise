package P067_AddBinary;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 二进制字符串加法运算。和415题Add String类似
 *
 * @author Lin Hui
 * Created on 2019/2/19 16:27
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals("100", addBinary("11", "1"));
        Assert.assertEquals("10101", addBinary("1010", "1011"));
    }

    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int k = Math.max(a.length(), b.length());
        char[] chars = new char[k];
        char plus = '0';
        while (i >= 0 || j >= 0) {
            char charA = '0';
            char charB = '0';
            if (i >= 0) {
                charA = a.charAt(i);
            }
            if (j >= 0) {
                charB = b.charAt(j);
            }
            int t = charA - '0' + charB - '0' + plus - '0';
            if (t > 1) {
                plus = '1';
            } else {
                plus = '0';
            }
            chars[--k] = (char) ((t & 1) + '0');
            i--;
            j--;
        }
        if (plus == '0') {
            return String.valueOf(chars);
        } else {
            return plus + String.valueOf(chars);
        }
    }
}
