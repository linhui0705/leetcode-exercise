package P941_ValidMountainArray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2019-1-6 20:23
 */
public class Solution1 {
    @Test
    public void testCase() {
        int[] array1 = new int[]{2, 1};
        Assert.assertFalse(validMountainArray(array1));

        int[] array2 = new int[]{3, 5, 5};
        Assert.assertFalse(validMountainArray(array2));

        int[] array3 = new int[]{0, 3, 2, 1};
        Assert.assertTrue(validMountainArray(array3));

        int[] array4 = new int[]{1, 2, 3, 4, 3, 4};
        Assert.assertFalse(validMountainArray(array4));
    }

    public boolean validMountainArray(int[] A) {
        int peak = 0;
        int end = 0;
        for (int i = 0; i + 1 < A.length && A[i] < A[i + 1]; i++) {
            peak = i + 1;
        }
        if (peak == 0 || peak == A.length - 1) {
            return false;
        }

        for (int i = peak; i + 1 < A.length && A[i] > A[i + 1]; i++) {
            end = i + 1;
        }
        return end == A.length - 1;
    }
}
