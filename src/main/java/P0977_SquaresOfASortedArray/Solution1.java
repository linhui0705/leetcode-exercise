package P0977_SquaresOfASortedArray;

import org.junit.Test;

import java.util.Arrays;

/**
 * Title: Solution1
 * Description:
 * 先平方，后排序
 *
 * @author Lin Hui
 * Created on 2019-1-20 13:29
 */
public class Solution1 {
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
        for (int i = 0; i < A.length; i++) {
            A[i] *= A[i];
        }
        Arrays.sort(A);
        return A;
    }
}
