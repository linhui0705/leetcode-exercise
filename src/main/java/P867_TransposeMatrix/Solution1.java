package P867_TransposeMatrix;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 矩阵转置，水题
 *
 * @author Lin Hui
 * Created on 2018-12-30 14:34
 */
public class Solution1 {
    @Test
    public void testCase() {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] B = {{1,2,3},{4,5,6}};

        int[][] T = transpose(B);
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                System.out.print(T[i][j]);
            }
            System.out.println();
        }
    }

    public int[][] transpose(int[][] A) {
        int x = A.length;
        int y = A[0].length;
        int[][] B = new int[y][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                B[j][i]=A[i][j];
            }
        }
        return B;
    }
}
