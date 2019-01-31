package P349_IntersectionOfTwoArrays;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Title: Solution1
 * Description:
 * 使用HashSet
 *
 * @author Lin Hui
 * Created on 2019-1-31 22:04
 */
public class Solution1 {
    @Test
    public void testCase() {
        int[] result1 = intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        int[] result2 = intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});
        int[] result3 = intersection(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, new int[]{9, 7, 5, 3, 1});
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (int i : nums1) {
            set.add(i);
        }

        for (int i : nums2) {
            if (set.contains(i) && !result.contains(i)) {
                result.add(i);
            }
        }

        int[] array = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            array[i] = result.get(i);
        }
        return array;
    }
}
