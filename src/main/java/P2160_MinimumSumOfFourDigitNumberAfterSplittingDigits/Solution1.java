package P2160_MinimumSumOfFourDigitNumberAfterSplittingDigits;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Title: Solution1
 * Description:
 * 有点浮躁，找一道水题来AC。
 * 给定一个四位数的数字num（1000<=num<=9999），现将这个数字拆分重新组合成一对数字[new1, new2]，使得new1+new2最小。
 * 要想两新数字之和尽可能小，两个数字均为两位数，且十位数尽可能取最小的数。
 *
 * @author Lin Hui
 * Created on 2022/2/22 17:13:35
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(52, minimumSum(2932));
        Assert.assertEquals(13, minimumSum(4009));
        Assert.assertEquals(1, minimumSum(1000));
        Assert.assertEquals(198, minimumSum(9999));
        Assert.assertEquals(10, minimumSum(5050));
        Assert.assertEquals(10, minimumSum(5500));
        Assert.assertEquals(10, minimumSum(5005));
    }

    public int minimumSum(int num) {
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = num % 10;
            num = num / 10;
        }
        Arrays.sort(arr);
        int a = arr[0] * 10 + arr[2];
        int b = arr[1] * 10 + arr[3];
        return a + b;
    }
}
