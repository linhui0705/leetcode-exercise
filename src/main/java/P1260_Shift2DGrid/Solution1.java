package P1260_Shift2DGrid;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 * 输出偏移k个元素的矩阵
 *
 * @author Lin Hui
 * Created on 2019/12/25 3:22 下午
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        //m行
        int m = grid.length;
        //n列
        int n = grid[0].length;
        int p = 0;
        int[] arr = new int[m * n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[p++] = grid[i][j];
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        p = (m * n) - k % (m * n);
        for (int i = 0; i < m; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list.add(arr[p++ % (m * n)]);
            }
            ans.add(list);
        }
        return ans;
    }
}
