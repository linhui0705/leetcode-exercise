package P0566_ReshapeTheMatrix;

import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 *
 * @author Lin Hui
 * Created on 2018/4/4 15:01
 */
public class Solution2 {
    @Test
    public void testCase() {
        int[][] nums = new int[][]{{1, 2}, {3, 4}};
        int[][] numNums = matrixReshape(nums, 2, 2);
        for (int i = 0; i < numNums.length; i++) {
            for (int j = 0; j < numNums[i].length; j++) {
                System.out.print(numNums[i][j]);
            }
            System.out.println();
        }
    }

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        int col = nums[0].length;
        if (row * col != r * c) {
            return nums;
        }

        int[][] matrix = new int[r][c];
        int a = 0;
        int b = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(String.format("(a,b)=(%d,%d)", a, b));
                matrix[a][b] = nums[i][j];
                if (b++ + 1 == c) {
                    a++;
                    b=0;
                }
            }
        }

        return matrix;
    }

}
