package P2011_FinalValueOfVariableAfterPerformingOperations;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定计算操作，"X++"和"++X"操作表示变量X自增1；"X--"和"--X"操作表示变量X自减1。计算返回最终值X。
 * 水题。
 *
 * @author Lin Hui
 * Created on 2022/2/18 11:15:18
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(1, finalValueAfterOperations(new String[]{"--X", "X++", "X++"}));
        Assert.assertEquals(3, finalValueAfterOperations(new String[]{"++X", "++X", "X++"}));
        Assert.assertEquals(0, finalValueAfterOperations(new String[]{"X++", "++X", "--X", "X--"}));
    }

    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for (String op : operations) {
            if ("++X".equals(op) || "X++".equals(op)) {
                ans++;
            } else if ("--X".equals(op) || "X--".equals(op)) {
                ans--;
            }
        }
        return ans;
    }
}
