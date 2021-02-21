package P1550_ThreeConsecutiveOdds;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一个数组，判断数组中是否有三个奇数元素连续无间隔。
 *
 * @author Lin Hui
 * Created on 2021/2/21 13:52:00
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertFalse(threeConsecutiveOdds(new int[]{2, 6, 4, 1}));
        Assert.assertTrue(threeConsecutiveOdds(new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12}));
        Assert.assertFalse(threeConsecutiveOdds(new int[]{1, 2, 34, 3, 4, 5, 7, 12, 23}));
    }

    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for (int value : arr) {
            if (value % 2 == 0) {
                count = 0;
            } else {
                count++;
            }
            if (count >= 3) {
                return true;
            }
        }
        return false;
    }
}
