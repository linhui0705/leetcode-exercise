package P961_NRepeatedElementInSize2NArray;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2019-1-19 20:33
 */
public class Solution1 {
    @Test
    public void testCase() {
        int[] a = new int[]{1, 2, 3, 3};
        Assert.assertEquals(3, repeatedNTimes(a));
        int[] b = new int[]{2, 1, 2, 5, 3, 2};
        Assert.assertEquals(2, repeatedNTimes(b));
        int[] c = new int[]{5, 1, 5, 2, 5, 3, 5, 4};
        Assert.assertEquals(5, repeatedNTimes(c));
        int[] d = new int[]{9, 5, 3, 3};
        Assert.assertEquals(3, repeatedNTimes(d));
    }

    public int repeatedNTimes(int[] A) {
        Arrays.sort(A);
        if (A[0] == A[A.length / 2 - 1]) {
            return A[0];
        }
        if (A[A.length - 1] == A[A.length / 2]) {
            return A[A.length - 1];
        }
        return A[A.length / 2];
    }
}
