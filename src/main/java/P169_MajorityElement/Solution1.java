package P169_MajorityElement;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * Title: Solution1
 * Description:
 * 排序，取中位数，最暴力简单，但没那么巧妙
 *
 * @author Lin Hui
 * Created on 2018/12/25 10:29
 */
public class Solution1 {
    @Test
    public void testCase() {
        int[] a = new int[]{2, 2, 1, 1, 1, 2, 2};
        Assert.assertEquals(2, majorityElement(a));

        int[] b = new int[]{3, 2, 3};
        Assert.assertEquals(3, majorityElement(b));
    }

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
