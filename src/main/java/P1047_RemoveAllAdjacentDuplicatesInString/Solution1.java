package P1047_RemoveAllAdjacentDuplicatesInString;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

/**
 * Title: Solution1
 * Description:
 * 给定一字符串，重复删除两个相邻且相同的字母，最后输出结果
 * 使用栈处理，但是输出的时候感觉有点累赘，出栈后还要翻转字符串……
 *
 * @author Lin Hui
 * Created on 2019/5/27 10:52
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals("", removeDuplicates(""));
        Assert.assertEquals("ca", removeDuplicates("abbaca"));
        Assert.assertEquals("", removeDuplicates("aabbccdd"));
        Assert.assertEquals("cd", removeDuplicates("aabbcddd"));
    }

    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for (char c : S.toCharArray()) {
            if (!stack.isEmpty()) {
                char peak = stack.peek();
                if (peak == c) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
