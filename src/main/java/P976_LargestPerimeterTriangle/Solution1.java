package P976_LargestPerimeterTriangle;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Title: Solution1
 * Description:
 * 能构成三角相的最大周长
 *
 * @author Lin Hui
 * Created on 2019-1-20 14:28
 */
public class Solution1 {
    @Test
    public void testCase() {
        int[] a1 = new int[]{2, 1, 2};
        Assert.assertEquals(5, largestPerimeter(a1));
        int[] a2 = new int[]{1, 2, 1};
        Assert.assertEquals(0, largestPerimeter(a2));
        int[] a3 = new int[]{3, 2, 3, 4};
        Assert.assertEquals(10, largestPerimeter(a3));
        int[] a4 = new int[]{3, 6, 2, 3};
        Assert.assertEquals(8, largestPerimeter(a4));
    }

    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i >= 2; i--) {
            if (A[i] < A[i - 1] + A[i - 2]) {
                return A[i] + A[i - 1] + A[i - 2];
            }
        }
        return 0;
    }
}
