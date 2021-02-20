package P1752_CheckIfArrayIsSortedAndRotated;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一个数组，若首尾相接成一个环，判断这个环是否从小到大递增。
 * 很简单，判断数组相邻元素逆序的个数即可，若达到两个以上，则说明不能从小到大递增。
 *
 * @author Lin Hui
 * Created on 2021/2/20 23:29:21
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertTrue(check(new int[]{3, 4, 5, 1, 2}));
        Assert.assertFalse(check(new int[]{2, 1, 3, 4}));
        Assert.assertTrue(check(new int[]{1, 2, 3}));
        Assert.assertTrue(check(new int[]{1, 1, 1}));
        Assert.assertTrue(check(new int[]{2, 1}));
        Assert.assertTrue(check(new int[]{1}));
    }

    public boolean check(int[] nums) {
        int times = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                times++;
            }
        }
        return times <= 1;
    }
}
