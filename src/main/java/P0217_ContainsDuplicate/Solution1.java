package P0217_ContainsDuplicate;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2019-1-16 23:34
 */
public class Solution1 {
    @Test
    public void testCase() {
        int[] nums1 = new int[]{1, 2, 3, 1};
        Assert.assertTrue(containsDuplicate(nums1));

        int[] nums2 = new int[]{1, 2, 3, 4};
        Assert.assertFalse(containsDuplicate(nums2));

        int[] nums3 = new int[]{1,1,1,3,3,4,3,2,4,2};
        Assert.assertTrue(containsDuplicate(nums3));
    }

    public boolean containsDuplicate(int[] nums) {
        Set set = new HashSet<>();
        for (int i : nums) {
            if (!set.add(i)) {
                return true;
            }
        }

        return false;
    }
}
