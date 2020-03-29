package P1365_HowManyNumbersAreSmallerThanTheCurrentNumber;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * Title: Solution1
 * Description:
 * 计算比当前元素大的元素个数。
 * 3ms
 *
 * @author Lin Hui
 * Created on 2020/3/29 9:39 上午
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertArrayEquals(new int[]{4, 0, 1, 1, 3}, smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3}));
        Assert.assertArrayEquals(new int[]{2, 1, 0, 3}, smallerNumbersThanCurrent(new int[]{6, 5, 4, 8}));
        Assert.assertArrayEquals(new int[]{0, 0, 0, 0}, smallerNumbersThanCurrent(new int[]{7, 7, 7, 7}));
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int[] arr = nums.clone();
        Arrays.sort(arr);

        Map<Integer, Integer> map = new HashMap<>();
        int k = 0;
        map.put(arr[0], k++);
        for (int i = 1; i < len; i++, k++) {
            if (arr[i - 1] != arr[i]) {
                map.put(arr[i], k);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(nums[i]);
        }
        return arr;
    }
}
