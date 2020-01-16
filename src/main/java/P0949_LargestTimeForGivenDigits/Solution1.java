package P0949_LargestTimeForGivenDigits;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定长度为4的int数组，判断数组是否能组成最大的时间
 * 暴力破解……
 *
 * @author Lin Hui
 * Created on 2020-1-16 16:20
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals("23:41", largestTimeFromDigits(new int[]{1, 2, 3, 4}));
        Assert.assertEquals("", largestTimeFromDigits(new int[]{5, 5, 5, 5}));
    }

    public String largestTimeFromDigits(int[] A) {
        int ans = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0 || A[i] == 1 || A[i] == 2) {
                for (int j = 0; j < A.length; j++) {
                    int hour = A[i] * 10 + A[j];
                    if (i != j && hour < 24) {
                        for (int k = 0; k < A.length; k++) {
                            if (k != i && k != j) {
                                int l = 6 - i - j - k;
                                int min = A[k] * 10 + A[l];
                                if (min < 60) {
                                    ans = Math.max(ans, hour * 60 + min);
                                }
                            }
                        }
                    }
                }
            }
        }
        return ans >= 0 ? String.format("%02d:%02d", ans / 60, ans % 60) : "";
    }
}
