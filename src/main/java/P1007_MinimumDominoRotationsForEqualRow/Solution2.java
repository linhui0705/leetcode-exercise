package P1007_MinimumDominoRotationsForEqualRow;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 * 看了大佬的题解，确实很巧妙……
 * 如果元素互换后其中一个数组元素全部一致，那这个数组的元素必定是A[0]或B[0]。
 * 因此，遍历数组A和数组B，只需比较A[0]和B[0]就可以了……
 *
 * @author Lin Hui
 * Created on 2019/3/15 15:17
 */
public class Solution2 {
    @Test
    public void testCase() {
        Assert.assertEquals(2, minDominoRotations(new int[]{2, 1, 2, 4, 2, 2}, new int[]{5, 2, 6, 2, 3, 2}));
        Assert.assertEquals(-1, minDominoRotations(new int[]{3, 5, 1, 2, 3}, new int[]{3, 6, 3, 3, 4}));
    }

    public int minDominoRotations(int[] A, int[] B) {
        int n = A.length;
        for (int i = 0, a = 0, b = 0; i < n && (A[i] == A[0] || B[i] == A[0]); ++i) {
            if (A[i] != A[0]) a++;
            if (B[i] != A[0]) b++;
            if (i == n - 1) return Math.min(a, b);
        }
        for (int i = 0, a = 0, b = 0; i < n && (A[i] == B[0] || B[i] == B[0]); ++i) {
            if (A[i] != B[0]) a++;
            if (B[i] != B[0]) b++;
            if (i == n - 1) return Math.min(a, b);
        }
        return -1;
    }
}
