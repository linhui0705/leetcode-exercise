package P1006_ClumsyFactorial;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

/**
 * Title: Solution1
 * Description:
 * 从N到1，依序给乘除加减符号，按照四则运算返回结果。
 * e.g.:
 * clumsy(10)=10*9/8+7-6*5/4+3-2*1=12
 *
 * 刚开始考虑四则运算，乘除优先于加减，所以使用栈来处理
 * 周赛结束，看了两三分钟写完的大佬，结果都是for循环或者递归搞定的……
 * 图样图森破……运算符号的顺序都固定是乘除加减，确实能再简单处理的……
 *
 * @author Lin Hui
 * Created on 2019/3/15 14:44
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(7, clumsy(4));
        Assert.assertEquals(12, clumsy(10));
    }

    public int clumsy(int N) {
        int count = N;
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(N);
        for (int i = 0; i < count && N > 1; i++) {
            int k = 0;
            switch (i % 4) {
                case 0:
                    k = stack.pop();
                    k *= --N;
                    stack.push(k);
                    break;
                case 1:
                    k = stack.pop();
                    k /= --N;
                    stack.push(k);
                    break;
                case 2:
                    k = --N;
                    stack.push(k);
                    break;
                case 3:
                    k = --N;
                    stack.push(-k);
                    break;
                default:
                    break;
            }
        }
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }
        return ans;
    }
}
