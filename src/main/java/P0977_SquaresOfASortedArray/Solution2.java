package P0977_SquaresOfASortedArray;

import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 * 参考Discuss解法
 *
 * @author Lin Hui
 * Created on 2019-1-20 13:43
 */
public class Solution2 {
    @Test
    public void testCase() {
        int[] a1 = new int[]{-4, -1, 0, 3, 10};
        for (int i : sortedSquares(a1)) {
            System.out.print(i);
            System.out.print(" ");
        }

        System.out.println("");

        int[] a2 = new int[]{-7, -3, 2, 3, 11};
        for (int i : sortedSquares(a2)) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    public int[] sortedSquares(int[] A) {
        int n = A.length;
        int[] result = new int[n];
        int i = 0, j = n - 1;
        for (int p = n - 1; p >= 0; p--) {
            if (Math.abs(A[i]) > Math.abs(A[j])) {
                result[p] = A[i] * A[i];
                i++;
            } else {
                result[p] = A[j] * A[j];
                j--;
            }
        }
        return result;
    }
}
