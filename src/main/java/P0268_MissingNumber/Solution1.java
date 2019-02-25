package P0268_MissingNumber;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2018-12-30 14:53
 */
public class Solution1 {
    @Test
    public void testCase() {
        int[] a = new int[]{3, 0, 1};
        int[] b = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};
        Assert.assertEquals(2, missingNumber(a));
        Assert.assertEquals(8, missingNumber(b));
    }

    public int missingNumber(int[] nums) {
        int[] array = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            array[nums[i]] = 1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}
