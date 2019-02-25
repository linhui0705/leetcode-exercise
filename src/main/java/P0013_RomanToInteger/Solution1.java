package P0013_RomanToInteger;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

/**
 * Title: Solution1
 * Description:
 * 用栈，效率不是很高……
 *
 * @author Lin Hui
 * Created on 2019-1-20 11:20
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(3, romanToInt("III"));
        Assert.assertEquals(4, romanToInt("IV"));
        Assert.assertEquals(9, romanToInt("IX"));
        Assert.assertEquals(58, romanToInt("LVIII"));
        Assert.assertEquals(1994, romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case 'I':
                    stack.push(1);
                    break;
                case 'V':
                    stack.push(5);
                    break;
                case 'X':
                    stack.push(10);
                    break;
                case 'L':
                    stack.push(50);
                    break;
                case 'C':
                    stack.push(100);
                    break;
                case 'D':
                    stack.push(500);
                    break;
                case 'M':
                    stack.push(1000);
                    break;
                default:
                    break;
            }
        }
        while (!stack.isEmpty()) {
            int num = stack.pop();
            result += num;
            if (!stack.isEmpty() && num > stack.peek()) {
                result -= stack.pop();
            }
        }
        return result;
    }
}
