package P1007_MinimumDominoRotationsForEqualRow;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定两个等长的数组，数组的元素在1到6之间。将数组A的一个元素和数组B的一个元素互换，至少需要多少次这样的操作，能使得A数组或B数组的元素均为同一元素。
 * 又是贪心的题目。
 * 说来话长，这个方法确实比较笨。不推荐……
 *
 * @author Lin Hui
 * Created on 2019/3/15 14:56
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(2, minDominoRotations(new int[]{2, 1, 2, 4, 2, 2}, new int[]{5, 2, 6, 2, 3, 2}));
        Assert.assertEquals(-1, minDominoRotations(new int[]{3, 5, 1, 2, 3}, new int[]{3, 6, 3, 3, 4}));
    }

    public int minDominoRotations(int[] A, int[] B) {
        return Math.min(result(A, B), result(B, A));
    }

    public int result(int[] A, int[] B) {
        int ans = 0;
        int[] count = new int[7];
        for (int i = 0; i < A.length; i++) {
            if (A[i] == B[i]) {
                count[A[i]]++;
            } else {
                count[A[i]]++;
                count[B[i]]++;
            }
        }
        int target = -1;
        for (int i = 1; i < count.length; i++) {
            if (count[i] == A.length) {
                target = i;
            }
        }
        if (target == -1) {
            return -1;
        }
        for (int i : A) {
            if (i == target) {
                ans++;
            }
        }
        return ans * 2 > A.length ? A.length - ans : ans;
    }
}
