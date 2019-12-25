package P1287_ElementAppearingMoreThan25PercentInSortedArray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 * 依题意，给定集合有序，直接遍历下去找就能找到那个出现超过25%的数字了。
 *
 * @author Lin Hui
 * Created on 2019/12/25 9:39 下午
 */
public class Solution2 {
    @Test
    public void testCase() {
        Assert.assertEquals(6, findSpecialInteger(new int[]{1, 2, 2, 6, 6, 6, 6, 7, 10}));
    }

    public int findSpecialInteger(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                count++;
            } else {
                if (arr[i - 1] == arr[i]) {
                    count++;
                    if (count * 4 > arr.length) {
                        return arr[i];
                    }
                } else {
                    count = 1;
                }
            }
        }
        return arr[0];
    }
}
