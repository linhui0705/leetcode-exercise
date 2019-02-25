package P0026_RemoveDuplicatesFromSortedArray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2019-1-6 19:20
 */
public class Solution1 {
    @Test
    public void testCase() {
        int[] nums1 = new int[]{1, 1, 2};
        Assert.assertEquals(2, removeDuplicates(nums1));
        for (int i : nums1) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();

        int[] nums2 = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        Assert.assertEquals(5, removeDuplicates(nums2));
        for (int i : nums2) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();

        int[] nums3 = new int[]{0};
        Assert.assertEquals(1, removeDuplicates(nums3));
        for (int i : nums3) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                ans++;
            } else {
                nums[i + 1 - ans] = nums[i + 1];
            }
        }
        return nums.length - ans;
    }
}
