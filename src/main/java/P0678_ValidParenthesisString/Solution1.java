package P0678_ValidParenthesisString;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

/**
 * Title: Solution1
 * Description:
 * 给定一个字符串，字符串包含()括号和*符号，*符号可替代为()括号或空字符。
 * 判断这个字符串是否对称。
 *
 * @author Lin Hui
 * Created on 2020/4/16 17:54:40
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertTrue(checkValidString("()"));
        Assert.assertTrue(checkValidString("(*)"));
        Assert.assertTrue(checkValidString("(*))"));
        Assert.assertFalse(checkValidString("((*((*)))(**(()*)))))(("));
    }

    public boolean checkValidString(String s) {
        Stack<Integer> leftStack = new Stack<>();
        Stack<Integer> starStack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '(':
                    leftStack.push(i);
                    break;
                case '*':
                    starStack.push(i);
                    break;
                case ')':
                    if (leftStack.empty() && starStack.empty()) {
                        return false;
                    }
                    if (!leftStack.empty()) {
                        leftStack.pop();
                    } else if (!starStack.empty()) {
                        starStack.pop();
                    }
                    break;
                default:
                    break;
            }
        }
        while (!leftStack.empty() && !starStack.empty()) {
            if (leftStack.pop() > starStack.pop()) {
                return false;
            }
        }
        return leftStack.empty();
    }
}
