package P1346_CheckIfNAndItsDoubleExist;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Title: Solution1
 * Description:
 * 给定一个数组，是否能够找到两个元素M和N，使得N=2*M
 *
 * @author Lin Hui
 * Created on 2020/2/9 23:32
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertTrue(checkIfExist(new int[]{10, 2, 5, 3}));
        Assert.assertTrue(checkIfExist(new int[]{7, 1, 14, 11}));
        Assert.assertFalse(checkIfExist(new int[]{3, 1, 7, 11}));
        Assert.assertFalse(checkIfExist(new int[]{-2, 0, 10, -19, 4, 6, -8}));
        Assert.assertTrue(checkIfExist(new int[]{0, 0}));
    }

    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if ((set.contains(i * 2) || (set.contains(i / 2) && i % 2 == 0))) {
                return true;
            }
            set.add(i);
        }
        return false;
    }
}
