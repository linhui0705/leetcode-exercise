package P1572_MatrixDiagonalSum;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一个N*N的矩阵，计算对角线元素的和。
 * 两次遍历分别取两个对角线元素的和，如果矩阵每行长度N为奇数，则意味着矩阵中心的元素重复累加，需要减掉。
 * 最优解：sum += mat[r][r] + mat[r][n - r- 1];，一遍循环，即可取到两个对角线的元素和。
 *
 * @author Lin Hui
 * Created on 2021/2/19 22:07:21
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(25, diagonalSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        Assert.assertEquals(8, diagonalSum(new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}}));
        Assert.assertEquals(5, diagonalSum(new int[][]{{5}}));
    }

    public int diagonalSum(int[][] mat) {
        int ans = 0;
        for (int i = 0, j = 0; i < mat.length; i++, j++) {
            ans += mat[i][j];
        }
        for (int i = 0, j = mat.length - 1; i < mat.length; i++, j--) {
            ans += mat[i][j];
        }
        if (mat.length % 2 != 0) {
            ans -= mat[mat.length / 2][mat.length / 2];
        }
        return ans;
    }
}
