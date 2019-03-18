package P0482_LicenseKeyFormatting;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 将密钥字符串按题目要求格式化，用“-”字符分割字符串。除第一组字符串外，每组字符串需有K个字符，且需将所有小写字母转换为大写。
 *
 * @author Lin Hui
 * Created on 2019-3-17 16:30
 */
public class Solution1 {
    @Test
    public void testCase() {
        System.out.println(licenseKeyFormatting("5F3Z-2e-9-w", 4));
    }

    public String licenseKeyFormatting(String S, int K) {
        S = S.replace("-", "");
        int mod = S.length() % K;
        int i = 0;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        if (mod > 0) {
            while (i < mod) {
                sb.append(upper(S.charAt(i++)));
                count = K;
            }
        }
        while (i < S.length()) {
            if (count == K) {
                sb.append("-");
                count = 0;
            }
            sb.append(upper(S.charAt(i++)));
            count++;
        }
        return sb.toString();
    }

    public char upper(char c) {
        if (c >= 'a' && c <= 'z') {
            return (char) (c - 'a' + 'A');
        }
        return c;
    }
}
