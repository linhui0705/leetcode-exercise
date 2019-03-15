package P0860_LemonadeChange;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 顾客排队买柠檬水，数组元素为每个顾客手里的钞票金额。判断能否给每个顾客找钱。
 * 贪心，比较水吧，尽可能把最大面额的钱找回给顾客，用if-else和switch-case条件分支来解。
 *
 * @author Lin Hui
 * Created on 2019/3/15 16:42
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertTrue(lemonadeChange(new int[]{5, 5, 5, 10, 20}));
        Assert.assertTrue(lemonadeChange(new int[]{5, 5, 10}));
        Assert.assertFalse(lemonadeChange(new int[]{10, 10}));
        Assert.assertFalse(lemonadeChange(new int[]{5, 5, 10, 10, 20}));
        Assert.assertTrue(lemonadeChange(new int[]{5, 5, 10, 20, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 5, 5, 20, 5, 20, 5}));
    }

    public boolean lemonadeChange(int[] bills) {
        int[] money = new int[3];
        for (int i = 0; i < bills.length; i++) {
            switch (bills[i]) {
                case 5:
                    money[0]++;
                    break;
                case 10:
                    if (money[0] > 0) {
                        money[1]++;
                        money[0]--;
                        break;
                    } else {
                        return false;
                    }
                case 20:
                    if (money[1] > 0 && money[0] > 0) {
                        money[2]++;
                        money[1]--;
                        money[0]--;
                        break;
                    } else if (money[0] >= 3) {
                        money[2]++;
                        money[0] = money[0] - 3;
                        break;
                    } else {
                        return false;
                    }
                default:
                    break;
            }
        }
        return true;
    }
}
