package P1534_CountGoodTriplets;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定数组arr和三个值a,b,c。
 * 若三元组满足一下四个条件：
 * 0 <= i < j < k < arr.length
 * |arr[i] - arr[j]| <= a
 * |arr[j] - arr[k]| <= b
 * |arr[i] - arr[k]| <= c
 * 则三元组是good的。
 * 统计出数组中符合以上条件的三元组的数量。
 * 第一反应，直接暴力，1ms，击败94.10%
 *
 * @author Lin Hui
 * Created on 2021/2/19 21:48:09
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(4, countGoodTriplets(new int[]{3, 0, 1, 1, 9, 7}, 7, 2, 3));
        Assert.assertEquals(0, countGoodTriplets(new int[]{1, 1, 2, 2, 3}, 0, 0, 1));
    }

    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int ans = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (Math.abs(arr[i] - arr[j]) <= a) {
                    for (int k = j + 1; k < arr.length; k++) {
                        if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                            ans++;
                        }
                    }
                }
            }
        }
        return ans;
    }
}
