package P1460_MakeTwoArraysEqualByReversingSubArrays;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Title: Solution1
 * Description:
 * 给定两个数组target和arr，判断arr能否经过若干次子数组翻转后得到数组target。
 * 题目的本质，就是判断两数组集合是否相等。
 *
 * @author Lin Hui
 * Created on 2021/2/21 13:06:09
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertTrue(canBeEqual(new int[]{1, 2, 3, 4}, new int[]{2, 4, 1, 3}));
        Assert.assertTrue(canBeEqual(new int[]{7}, new int[]{7}));
        Assert.assertTrue(canBeEqual(new int[]{1, 12}, new int[]{12, 1}));
        Assert.assertFalse(canBeEqual(new int[]{3, 7, 9}, new int[]{3, 7, 11}));
        Assert.assertTrue(canBeEqual(new int[]{1, 1, 1, 1, 1}, new int[]{1, 1, 1, 1, 1}));
    }

    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        for (int i = 0; i < target.length; i++) {
            if (target[i] != arr[i]) {
                return false;
            }
        }
        return true;
    }
}
