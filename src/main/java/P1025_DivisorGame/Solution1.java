package P1025_DivisorGame;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 很烂的一道题目
 * 就是给定整数N，两人分别取x，x满足x∈(0,N)且N%x==0，然后用N-x替换N。当玩家无法操作即输。
 * Alice先手，Bob后手，返回Alice是否能赢。
 *
 * @author Lin Hui
 * Created on 2019-4-21 20:05
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertTrue(divisorGame(2));
        Assert.assertFalse(divisorGame(3));
    }

    public boolean divisorGame(int N) {
        boolean ans = false;
        while (N > 1) {
            for (int x = 1; x <= N - 1; x++) {
                if (N % x == 0) {
                    N = N - x;
                    ans = !ans;
                    break;
                }
            }
        }
        return ans;
    }
}
