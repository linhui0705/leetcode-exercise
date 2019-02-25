package P0415_AddStrings;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 借助StringBuilder反转
 *
 * @author Lin Hui
 * Created on 2019/2/14 10:28
 */
public class Solution1 {
    @Test
    public void testCase() {
        System.out.println(addStrings("2000", "125"));
        System.out.println(addStrings("125", "2000"));
    }

    public String addStrings(String num1, String num2) {
        StringBuilder n1 = new StringBuilder(num1).reverse();
        StringBuilder n2 = new StringBuilder(num2).reverse();
        StringBuilder n3 = new StringBuilder();
        int i = 0;
        int ans = 0;
        for (; i < Math.min(n1.length(), n2.length()); i++) {
            ans += (n1.charAt(i) - '0') + (n2.charAt(i) - '0');
            n3.append(ans % 10);
            ans /= 10;
        }
        for (; i < Math.max(n1.length(), n2.length()); i++) {
            if (n1.length() > n2.length()) {
                ans += n1.charAt(i) - '0';
            } else {
                ans += n2.charAt(i) - '0';
            }
            n3.append(ans % 10);
            ans /= 10;
        }
        if (ans > 0) {
            n3.append(ans);
        }

        return n3.reverse().toString();
    }
}
