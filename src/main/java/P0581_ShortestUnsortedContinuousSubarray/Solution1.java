package P0581_ShortestUnsortedContinuousSubarray;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Title: Solution1
 * Description:
 * 找出数组中的子串，将该子串排序后，使得整体数组有序。返回该子串的长度。
 * 偷个懒，复制数组，将其中一个数组排序后循环比较
 *
 * @author Lin Hui
 * Created on 2019-3-8 22:48
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(5, findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15}));
    }

    public int findUnsortedSubarray(int[] nums) {
        int[] arr = nums.clone();
        Arrays.sort(arr);
        int i = 0;
        int j = nums.length - 1;
        while (i < nums.length && nums[i] == arr[i]) i++;
        while (j >= 0 && nums[j] == arr[j]) j--;
        return i > j ? 0 : j - i + 1;
    }
}
