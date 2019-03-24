package P1020_PartitionArrayIntoThreePartsWithEqualSum;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一个数组，将其分成三段，若三段子数组的和相等，则返回true，否则返回false。
 * 可以先算出总数total，若总数能不能被3整除，则显然无论怎么将数组分成三段，都不可能相等。
 * 其次遍历数组，每当子数组和达总数total/3，则count++。
 * 若count达到3，则证明可以该数组可以被切分成三组和相等的子数组。
 *
 * @author Lin Hui
 * Created on 2019-3-24 13:08
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertTrue(canThreePartsEqualSum(new int[]{0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1}));
        Assert.assertFalse(canThreePartsEqualSum(new int[]{0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1}));
        Assert.assertTrue(canThreePartsEqualSum(new int[]{3, 3, 6, 5, -2, 2, 5, 1, -9, 4}));
    }

    public boolean canThreePartsEqualSum(int[] A) {
        int total = 0;
        for (int i : A) {
            total += i;
        }
        if (total % 3 != 0) {
            return false;
        }
        int count = 0;
        int sum = 0;
        for (int i : A) {
            sum += i;
            if (sum == total / 3) {
                count++;
                sum = 0;
            }
        }
        return count >= 3;
    }
}
