package P027_RemoveElement;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 移除数组元素
 *
 * @author Lin Hui
 * Created on 2019-1-6 15:33
 */
public class Solution1 {
    @Test
    public void testCase() {
        int[] array1 = new int[]{3, 2, 2, 3};
        Assert.assertEquals(2, removeElement(array1, 3));

        int[] array2 = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        Assert.assertEquals(5, removeElement(array2, 2));
    }

    public int removeElement(int[] nums, int val) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                ans++;
            } else {
                nums[i - ans] = nums[i];
            }
        }
        return nums.length - ans;
    }
}
