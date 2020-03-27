package P1380_LuckyNumbersInAMatrix;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 * 给定一个m行n列的矩阵，矩阵数字元素不重复，输出矩阵内的所有幸运数。幸运数可任意次序输出。
 * 幸运数是指一个元素在其所在的行是最小值，在其所在的列是最大值。
 * 首先逐行找到当前行最小的元素，然后在这个最小元素的当前列判断其是否为最大元素，若是则放入list。
 *
 * @author Lin Hui
 * Created on 2020/3/27 14:00
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int colIndex = 0;
            //找到当前行最小元素
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][colIndex] > matrix[i][j]) {
                    colIndex = j;
                }
            }
            int k = 0;
            //查看该元素是否为当前列的最大元素
            while (k < matrix.length) {
                if (matrix[k][colIndex] > matrix[i][colIndex]) {
                    break;
                }
                k++;
            }
            if (k == matrix.length) {
                ans.add(matrix[i][colIndex]);
            }
        }
        return ans;
    }
}
