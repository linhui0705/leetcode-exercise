package P1025_DivisorGame;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 * 题目的本质，就是求N模2是否等于0.
 *
 * @author Lin Hui
 * Created on 2019-4-21 20:10
 */
public class Solution2 {
    @Test
    public void testCase() {
        Assert.assertTrue(divisorGame(2));
        Assert.assertFalse(divisorGame(3));
    }

    public boolean divisorGame(int N) {
        return N % 2 == 0;
    }
}
