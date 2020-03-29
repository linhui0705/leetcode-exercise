package P1394_FindLuckyIntegerInAnArray;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: Solution1
 * Description:
 * 找幸运数。幸运数的定义：元素在数组中出现的次数正好等于这个元素本身。
 * 水题，HashMap解决。
 *
 * @author Lin Hui
 * Created on 2020/3/29 2:20 下午
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(2, findLucky(new int[]{2, 2, 3, 4}));
        Assert.assertEquals(3, findLucky(new int[]{1, 2, 2, 3, 3, 3}));
        Assert.assertEquals(-1, findLucky(new int[]{2, 2, 2, 3, 3}));
        Assert.assertEquals(-1, findLucky(new int[]{5}));
        Assert.assertEquals(7, findLucky(new int[]{7, 7, 7, 7, 7, 7, 7}));
    }

    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int max = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey().equals(entry.getValue())) {
                max = Math.max(max, entry.getKey());
            }
        }
        return max;
    }
}
