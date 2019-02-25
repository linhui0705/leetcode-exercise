package P0832_FlippingAnImage;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 之前看着总感觉有规律，可以简化。今天一下子就想到了
 * 规律：矩阵内互相垂直对称的元素，若二者相等，则两数变更，反之则不变。若该元素位于对称轴，则可看作是相同的数，需要变化
 *
 * @author Lin Hui
 * Created on 2018-12-30 13:29
 */
public class Solution1 {
    @Test
    public void testCase() {
        int[][] A = new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] B = new int[][]{{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        int[][] C = new int[][]{{1}};
        int[][] D = new int[][]{{1,1},{1,1}};
        int[][] T = flipAndInvertImage(D);

        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                System.out.print(T[i][j]);
            }
            System.out.println();
        }
    }

    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int len = A[i].length;
            int mid = A[i].length >> 1;
            mid = (len & 1) == 0 && mid > 0 ? mid - 1 : mid;
            for (int j = 0; j <= mid; j++) {
                if (A[i][j] == A[i][(len - 1) - j]) {
                    A[i][j] = A[i][(len - 1) - j] = (A[i][j] == 0 ? 1 : 0);
                }
            }
        }
        return A;
    }
}
