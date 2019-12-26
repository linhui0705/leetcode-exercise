package P1021_RemoveOutermostParentheses;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 去除最外层的括号
 *
 * @author Lin Hui
 * Created on 2019-12-26 15:19
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals("()()()", removeOuterParentheses("(()())(())"));
        Assert.assertEquals("()()()()(())", removeOuterParentheses("(()())(())(()(()))"));
        Assert.assertEquals("", removeOuterParentheses("()()"));
    }

    public String removeOuterParentheses(String S) {
        StringBuilder builder = new StringBuilder();
        int k = 0;
        for (char c : S.toCharArray()) {
            if (c == '(') {
                if (k != 0) {
                    builder.append(c);
                }
                k++;
            } else if (c == ')') {
                if (k != 1) {
                    builder.append(c);
                }
                k--;
            }
        }
        return builder.toString();
    }
}
