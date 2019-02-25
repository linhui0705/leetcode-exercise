package P0852_PeakIndexInAMountainArray;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 直接滚一遍，当前数比后一个树大，必定是最大数
 * 时间复杂度：O(n)
 *
 * @author Lin Hui
 * Created on 2018/6/25 14:29
 */
public class Solution1 {
    @Test
    public void testCase() {
        int[] A = {3, 4, 5, 1};
        System.out.println(peakIndexInMountainArray(A));
    }

    public int peakIndexInMountainArray(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1]) {
                return i;
            }
        }
        return 0;
    }
}
