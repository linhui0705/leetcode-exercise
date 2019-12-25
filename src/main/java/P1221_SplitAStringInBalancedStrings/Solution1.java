package P1221_SplitAStringInBalancedStrings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 左右跑，每回一次原点计数加一，返回计数的结果
 *
 * @author Lin Hui
 * Created on 2019/12/25 11:47 上午
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(4, balancedStringSplit("RLRRLLRLRL"));
        Assert.assertEquals(3, balancedStringSplit("RLLLLRRRLR"));
        Assert.assertEquals(1, balancedStringSplit("LLLLRRRR"));
        Assert.assertEquals(2, balancedStringSplit("RLRRRLLRLL"));
    }

    public int balancedStringSplit(String s) {
        int ans = 0;
        int pos = 0;
        for (char c : s.toCharArray()) {
            switch (c) {
                case 'L':
                    pos--;
                    break;
                case 'R':
                    pos++;
                    break;
                default:
                    break;
            }
            if (pos == 0) {
                ans++;
            }
        }
        return ans;
    }
}
