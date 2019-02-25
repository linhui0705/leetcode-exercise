package P0961_NRepeatedElementInSize2NArray;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Title: Solution2
 * Description:
 *
 * @author Lin Hui
 * Created on 2019-1-19 20:53
 */
public class Solution2 {
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
        Set set = new HashSet<>();
        for (int a : A) {
            if (!set.add(a)) {
                return a;
            }
        }
        return -1;
    }
}
