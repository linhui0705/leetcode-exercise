package P1287_ElementAppearingMoreThan25PercentInSortedArray;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: Solution1
 * Description:
 * 找出出现超过25%的数字
 * 用HashMap计数，效率低……其实没必要。
 *
 * @author Lin Hui
 * Created on 2019/12/25 21:37
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(6, findSpecialInteger(new int[]{1, 2, 2, 6, 6, 6, 6, 7, 10}));
    }

    public int findSpecialInteger(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() * 4 > arr.length) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
