package P1470_ShuffleTheArray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 题目大意是：给数组变化位置，将2n个元素[x1,x2,...xn,y1,y2,...,yn]变换顺序为[x1,y1,x2,y2,...,xn,yn]
 * 水题无误。双指针解决问题。
 *
 * @author Lin Hui
 * Created on 2021/2/10 10:46:19
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertArrayEquals(new int[]{2, 3, 5, 4, 1, 7}, shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3));
        Assert.assertArrayEquals(new int[]{1, 4, 2, 3, 3, 2, 4, 1}, shuffle(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4));
        Assert.assertArrayEquals(new int[]{1, 2, 1, 2}, shuffle(new int[]{1, 1, 2, 2}, 2));
    }

    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2 * n];
        int x = 0;
        int y = n;
        int i = 0;
        while (i < 2 * n) {
            arr[i++] = nums[x++];
            arr[i++] = nums[y++];
        }
        return arr;
    }
}
