package P0292_NimGame;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2019-1-16 23:38
 */
public class Solution1 {
    @Test
    public void testCase(){
        Assert.assertFalse(canWinNim(4));
    }

    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
