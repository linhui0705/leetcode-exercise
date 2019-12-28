package P0299_BullsAndCows;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 猜数字，根据正确数组返回Bull和Cow
 * Bull表示数字和位置均正确的数字个数
 * Cow表示数字正确但位置错误的数字个数
 *
 * @author Lin Hui
 * Created on 2019-12-28 11:57
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals("1A3B", getHint("1807", "7810"));
        Assert.assertEquals("1A1B", getHint("1123", "0111"));
    }

    public String getHint(String secret, String guess) {
        int bull = 0;
        int cow = 0;
        char[] chs = secret.toCharArray();
        char[] chg = guess.toCharArray();
        int[] scount = new int[10];
        int[] gcount = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            if (chs[i] == chg[i]) {
                bull++;
            }
            scount[chs[i] - '0']++;
            gcount[chg[i] - '0']++;
        }
        for (int i = 0; i < 10; i++) {
            cow += Math.min(scount[i], gcount[i]);
        }
        cow -= bull;
        return bull + "A" + cow + "B";
    }
}
