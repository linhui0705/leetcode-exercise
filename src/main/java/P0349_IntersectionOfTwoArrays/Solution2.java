package P0349_IntersectionOfTwoArrays;

import org.junit.Test;

import java.util.*;

/**
 * Title: Solution2
 * Description:
 * 使用HashMap
 *
 * @author Lin Hui
 * Created on 2019-1-31 22:17
 */
public class Solution2 {
    @Test
    public void testCase() {
        int[] result1 = intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        int[] result2 = intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});
        int[] result3 = intersection(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, new int[]{9, 7, 5, 3, 1});
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            }
        }
        for (int i : nums2) {
            Integer value = map.get(i);
            if (null != value && value == 1) {
                map.put(i, value + 1);
            }
        }
        int[] result = new int[map.size()];
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                result[count++] = entry.getKey();
            }
        }
        return Arrays.copyOf(result, count);
    }
}
