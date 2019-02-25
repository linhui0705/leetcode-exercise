package P0844_BackspaceStringCompare;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

/**
 * Title: Solution1
 * Description:
 * 方法一：用栈处理，遇到“#”，对字母出栈，反之入栈
 * 6ms，超过54.78%
 *
 * @author Lin Hui
 * Created on 2019-1-31 22:55
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertTrue(backspaceCompare("ab#c", "ad#c"));
        Assert.assertTrue(backspaceCompare("ab##", "c#d#"));
        Assert.assertTrue(backspaceCompare("a##c", "#a#c"));
        Assert.assertFalse(backspaceCompare("a#c", "b"));
        Assert.assertTrue(backspaceCompare("#####", "#"));
        Assert.assertTrue(backspaceCompare("", ""));
    }

    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();
        for (char s : S.toCharArray()) {
            if (s == '#') {
                if (!stackS.isEmpty()) {
                    stackS.pop();
                }
            } else {
                stackS.push(s);
            }
        }
        for (char t : T.toCharArray()) {
            if (t == '#') {
                if (!stackT.isEmpty()) {
                    stackT.pop();
                }
            } else {
                stackT.push(t);
            }
        }
        if (stackS.size() != stackT.size()) {
            return false;
        }
        while (!stackS.isEmpty()) {
            if (!stackS.pop().equals(stackT.pop())) {
                return false;
            }
        }
        return true;
    }
}
