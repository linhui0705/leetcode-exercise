package P896_MonotonicArray;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2018/12/24 15:54
 */
public class Solution1 {
    @Test
    public void testCase() {
        int[] a = new int[]{1,3,2};
        System.out.println(isMonotonic(a));
    }

    public boolean isMonotonic(int[] A) {
        int l = 0;
        int r = A.length - 1;
        if (A[l] <= A[r]) {
            for (int i = 1; i <= r; i++) {
                if (A[i - 1] > A[i]) {
                    return false;
                }
            }
        }
        if (A[l] > A[r]) {
            for (int i = 1; i <= r; i++) {
                if (A[i - 1] < A[i]) {
                    return false;
                }
            }
        }
        return true;
    }

}
