package P566_ReshapeTheMatrix;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2018/4/4 13:51
 */
public class Solution1 {
    @Test
    public void testCase() {
        int[][] nums = new int[][]{{1,2},{3,4}};
        int[][] numNums = matrixReshape(nums, 4, 1);
        for (int i = 0; i < numNums.length; i++) {
            for (int j = 0; j < numNums[i].length; j++) {
                System.out.print(numNums[i][j]);
            }
            System.out.println();
        }
    }

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums.length * nums[0].length != r * c) {
            return nums;
        }
        int[][] matrix = new int[r][c];
        int row = nums.length;
        int col = nums[0].length;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                queue.add(nums[i][j]);
            }
        }

        row = matrix.length;
        col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = queue.poll();
            }
        }
        return matrix;
    }
}
