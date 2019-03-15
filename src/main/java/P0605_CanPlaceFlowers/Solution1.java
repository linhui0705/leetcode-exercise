package P0605_CanPlaceFlowers;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 花圃已有一些花，给定一定数量的花，每株花有间隙的前提下，能否加n株花植入花圃中。
 * 没什么好的解法，就for循环扫描一遍吧……
 *
 * @author Lin Hui
 * Created on 2019/3/15 15:55
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertTrue(canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
        Assert.assertFalse(canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && ((i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0))) {
                flowerbed[i] = 1;
                count++;
            }
        }
        return count >= n;
    }
}
