package P415_AddStrings;

import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 * 看到的题解，自己试着写一遍。比较简洁。
 *
 * @author Lin Hui
 * Created on 2019/2/14 10:50
 */
public class Solution2 {
    @Test
    public void testCase() {
        System.out.println(addStrings("2000", "125"));
        System.out.println(addStrings("125", "2000"));
        System.out.println(addStrings("9999", "1"));
        System.out.println(addStrings("1", "9999"));
    }

    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        char[] chars = new char[Math.max(num1.length(), num2.length())];
        int k = chars.length - 1;
        int ans = 0;
        while (i >= 0 || j >= 0) {
            char a = '0';
            char b = '0';
            if (i >= 0) {
                a = num1.charAt(i--);
            }
            if (j >= 0) {
                b = num2.charAt(j--);
            }
            ans += (a - '0') + (b - '0');
            chars[k--] = (char) ((ans % 10) + '0');
            ans /= 10;
        }
        String str = String.valueOf(chars);
        if (ans > 0) {
            return ans + str;
        }
        return str;
    }
}
