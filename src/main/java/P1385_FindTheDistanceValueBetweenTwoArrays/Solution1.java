package P1385_FindTheDistanceValueBetweenTwoArrays;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Title: Solution1
 * Description:
 * 给定两个数组arr1和arr2，返回两个数组之间的距离值。
 * 距离值：对于元素 arr1[i] ，不存在任何元素 arr2[j] 满足 |arr1[i]-arr2[j]| <= d。
 * 6ms, faster than 31.53%
 *
 * @author Lin Hui
 * Created on 2020/3/29 3:27 下午
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(2, findTheDistanceValue(new int[]{4, 5, 8}, new int[]{10, 9, 1, 8}, 2));
        Assert.assertEquals(2, findTheDistanceValue(new int[]{1, 4, 2, 3}, new int[]{-4, -3, 6, 10, 20, 30}, 3));
        Assert.assertEquals(1, findTheDistanceValue(new int[]{2, 1, 100, 3}, new int[]{-5, -2, 10, -3, 7}, 6));
    }

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr2) {
            set.add(i);
        }
        int ans = arr1.length;
        for (int k : arr1) {
            // | arr1 - arr2 | <= d
            // arr1 - arr2 <= d
            // arr2 - arr1 <= d

            // arr1 - d <= arr2
            // arr2 <= arr1 + d
            // arr1 - d <= arr2 <= arr1 + d
            for (int i = k - d; i <= k + d; i++) {
                if (set.contains(i)) {
                    ans--;
                    break;
                }
            }
        }
        return ans;
    }
}
