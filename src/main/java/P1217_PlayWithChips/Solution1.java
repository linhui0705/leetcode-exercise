package P1217_PlayWithChips;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 题目的本质是，判断chips里奇数多还是偶数多，如果奇数多，返回偶数的个数，如果偶数多，返回奇数的个数
 *
 * @author Lin Hui
 * Created on 2019-12-26 20:41
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(1, minCostToMoveChips(new int[]{1, 2, 3}));
        Assert.assertEquals(2, minCostToMoveChips(new int[]{2, 2, 2, 3, 3}));
    }

    public int minCostToMoveChips(int[] chips) {
        int odd = 0;
        for (int i : chips) {
            if (i % 2 == 1) {
                odd++;
            }
        }
        return odd > chips.length / 2 ? chips.length - odd : odd;
    }
}
