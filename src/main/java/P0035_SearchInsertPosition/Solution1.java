package P0035_SearchInsertPosition;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2019-1-20 11:05
 */
public class Solution1 {
    @Test
    public void testCase() {
        int[] a = new int[]{1, 3, 5, 6};
        Assert.assertEquals(2, searchInsert(a, 5));
        Assert.assertEquals(1, searchInsert(a, 2));
        Assert.assertEquals(4, searchInsert(a, 7));
        Assert.assertEquals(0, searchInsert(a, 0));
    }

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}
